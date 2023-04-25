package com.leandrolcd.pruebatecnica.data.network

import android.util.Log
import com.google.gson.Gson
import com.leandrolcd.pruebatecnica.data.models.activations.DeviceDTO
import com.leandrolcd.pruebatecnica.data.models.activations.ErrorResponse
import com.leandrolcd.pruebatecnica.data.models.activations.PosResponse
import com.leandrolcd.pruebatecnica.ui.activate.Models.PosApi
import javax.inject.Inject

class ActivateService @Inject constructor(private val posClient: ActivateClient) {
    suspend fun doActivatePos(device: DeviceDTO): PosApi? {
        val activate = posClient.activatePOS(device)
        if (!activate.isSuccessful) {
            val errorResponse = activate.errorBody()?.let {
                val errorBody = it.string()
                Log.d("TAG", "doActivatePos: $errorBody")
                Gson().fromJson(errorBody, ErrorResponse::class.java)
            }
            throw Exception(errorResponse?.message ?: errorResponse?.error)

        }
        return activate.body()?.toPosApi()
    }


}

private fun PosResponse.toPosApi(): PosApi = PosApi(id=this.data.activation.deviceId, apiKey = this.data.activation.apiKey)

