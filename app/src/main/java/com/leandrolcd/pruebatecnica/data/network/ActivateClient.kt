package com.leandrolcd.pruebatecnica.data.network

import com.leandrolcd.pruebatecnica.data.models.activations.DeviceDTO
import com.leandrolcd.pruebatecnica.data.models.activations.PosResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ActivateClient {
    @POST("/api/v3/license/activate") //https://staging.otfpos.dev/api/v3/license/activate
    suspend fun activatePOS(@Body data: DeviceDTO):Response<PosResponse>


}