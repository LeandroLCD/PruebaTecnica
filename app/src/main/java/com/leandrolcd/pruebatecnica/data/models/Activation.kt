package com.leandrolcd.pruebatecnica.data.models


import com.google.gson.annotations.SerializedName

data class Activation(
    @SerializedName("active")
    val active: Int,
    @SerializedName("api_key")
    val apiKey: String,
    @SerializedName("bofa")
    val bofa: Boolean,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("device_id")
    val deviceId: String,
    @SerializedName("device_information")
    val deviceInformation: String,
    @SerializedName("hostname")
    val hostname: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("license_id")
    val licenseId: Int,
    @SerializedName("terminal_id")
    val terminalId: Int,
    @SerializedName("token")
    val token: Any?,
    @SerializedName("updated_at")
    val updatedAt: String
)