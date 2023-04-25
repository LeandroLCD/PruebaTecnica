package com.leandrolcd.pruebatecnica.data.models.activations


import com.google.gson.annotations.SerializedName

data class ErrorResponse(
    @SerializedName("data")
    val data: Any?,
    @SerializedName("error")
    val error: String,
    @SerializedName("response")
    val response: String,
    @SerializedName("message")
    val message: String?
)