package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class MenuResponse(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("error")
    val error: Any?,
    @SerializedName("response")
    val response: String
)