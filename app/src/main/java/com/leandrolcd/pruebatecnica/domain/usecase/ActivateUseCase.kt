package com.leandrolcd.pruebatecnica.domain.usecase

import android.content.Context
import android.util.Log
import com.google.gson.Gson
import com.leandrolcd.pruebatecnica.domain.PosRepository
import com.leandrolcd.pruebatecnica.ui.activate.ActivateViewModel
import com.leandrolcd.pruebatecnica.ui.activate.Models.DeviceInfo
import com.leandrolcd.pruebatecnica.ui.activate.Models.PosApi
import javax.inject.Inject

class ActivateUseCase @Inject constructor(private val repository: PosRepository,
                                          private val context: Context) {
    suspend operator fun invoke(deviceInfo: DeviceInfo) {
        Log.d("TAG", "useCase: $deviceInfo")
        repository.doActivatePos(deviceInfo)
    }

    fun getActivationData(): PosApi? {
        val jsonString = context.getSharedPreferences(ActivateViewModel.ACT_PREFS, Context.MODE_PRIVATE)
            .getString(ActivateViewModel.ACT_PREFS, null)
        return if (jsonString != null) {
            Gson().fromJson(jsonString, PosApi::class.java)
        } else {
            null
        }
    }

}