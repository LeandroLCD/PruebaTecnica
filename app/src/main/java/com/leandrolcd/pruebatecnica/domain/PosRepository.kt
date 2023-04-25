package com.leandrolcd.pruebatecnica.domain

import android.content.Context
import android.util.Log
import com.google.gson.Gson
import com.leandrolcd.pruebatecnica.data.models.activations.DeviceDTO
import com.leandrolcd.pruebatecnica.data.network.ActivateService
import com.leandrolcd.pruebatecnica.data.network.ApiService
import com.leandrolcd.pruebatecnica.ui.activate.ActivateViewModel
import com.leandrolcd.pruebatecnica.ui.activate.Models.DeviceInfo
import com.leandrolcd.pruebatecnica.ui.activate.Models.PosApi
import com.leandrolcd.pruebatecnica.ui.menu.models.Category
import com.leandrolcd.pruebatecnica.ui.utilities.toCategoryList
import javax.inject.Inject

class PosRepository @Inject constructor(
    private val service: ActivateService,
    private val apiService: ApiService,
    private val context: Context
) {

    suspend fun doActivatePos(deviceInfo: DeviceInfo): Boolean {
        val deviceId = "f5293f74-1ee4-b485-b69c-ad589f26184b"
        val deviceInformation = "PruebaConocimiento"

        val dto = DeviceDTO(
            deviceId = deviceId,
            deviceInformation = deviceInformation,
            hostname = deviceInfo.hostname,
            serial = deviceInfo.serial
        )
        val dev = service.doActivatePos(dto)
        if(dev != null){
            setActivationData(dev)
        }

        return dev != null
    }

   suspend fun doMenuAndConfiguration(): List<Category> {
       return apiService.doMenuAndConfiguration().toCategoryList()
   }

    private fun setActivationData(data: PosApi) {
        val jsonString = Gson().toJson(data)
        context.getSharedPreferences(ActivateViewModel.ACT_PREFS, Context.MODE_PRIVATE).also {
            it.edit().putString(ActivateViewModel.ACT_PREFS, jsonString).apply()
            Log.i("setData", jsonString.orEmpty())
        }
    }
}