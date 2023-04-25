package com.leandrolcd.pruebatecnica.data.network

import com.leandrolcd.pruebatecnica.data.models.menu.MenuResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiClient {
    @GET("/api/v3/products/menu")
    suspend fun menuAndConfigurations(): Response<MenuResponse>
}