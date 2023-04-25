package com.leandrolcd.pruebatecnica.core.networkmodule

import android.content.Context
import com.google.gson.Gson
import com.leandrolcd.pruebatecnica.ui.activate.ActivateViewModel
import com.leandrolcd.pruebatecnica.ui.activate.Models.PosApi
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class ApiInterceptor @Inject constructor(private val context: Context): Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val apiKey = getApiKey()
        val request = chain.request().newBuilder()
            .addHeader("Accept", "application/json")
            .addHeader("api-key", apiKey!!.apiKey)
            .addHeader("device-id", apiKey!!.id)
            .build()
        return  chain.proceed(request)
    }

    private fun getApiKey(): PosApi? {
        val jsonString = context.getSharedPreferences(ActivateViewModel.ACT_PREFS, Context.MODE_PRIVATE)
            .getString(ActivateViewModel.ACT_PREFS, null)
        return if (jsonString != null) {
            Gson().fromJson(jsonString, PosApi::class.java)
        } else {
            null
        }
    }

}
