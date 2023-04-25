package com.leandrolcd.pruebatecnica.data.network

import android.util.Log
import com.google.gson.Gson
import com.leandrolcd.pruebatecnica.data.models.activations.ErrorResponse
import com.leandrolcd.pruebatecnica.data.models.menu.MenuResponse
import javax.inject.Inject

class ApiService @Inject constructor(private val apiClient: ApiClient) {
    suspend fun doMenuAndConfiguration(): MenuResponse {
        val response = apiClient.menuAndConfigurations()
        if (!response.isSuccessful) {
            val errorResponse = response.errorBody()?.let {
                val errorBody = it.string()
                Log.d("TAG", "doActivatePos: $errorBody")
                Gson().fromJson(errorBody, ErrorResponse::class.java)
            }
            throw Exception(errorResponse?.message ?: errorResponse?.error)
        }
        return response.body()!!
    }
}