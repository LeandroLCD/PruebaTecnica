package com.leandrolcd.pruebatecnica.data.models


import com.google.gson.annotations.SerializedName

data class PosResponse(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("error")
    val error: Any?,
    @SerializedName("response")
    val response: String
)