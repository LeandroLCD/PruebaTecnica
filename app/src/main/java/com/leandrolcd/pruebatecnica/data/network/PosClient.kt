package com.leandrolcd.pruebatecnica.data.network

import com.leandrolcd.pruebatecnica.data.models.DeviceDTO
import com.leandrolcd.pruebatecnica.data.models.PosResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface PosClient {
    @POST("/api/v3/license/activate") //https://staging.otfpos.dev/api/v3/license/activate
    suspend fun activatePOS(@Body data:DeviceDTO):Response<PosResponse>

    @GET("/api/v3/products/menu")
    suspend fun menuAndConfigurations()
}