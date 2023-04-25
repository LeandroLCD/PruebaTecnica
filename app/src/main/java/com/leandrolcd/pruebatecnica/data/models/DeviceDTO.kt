package com.leandrolcd.pruebatecnica.data.models


import com.google.gson.annotations.SerializedName

data class DeviceDTO(
    @SerializedName("device_id")
    val deviceId: String,
    @SerializedName("device_information")
    val deviceInformation: String,
    @SerializedName("hostname")
    val hostname: String,
    @SerializedName("serial")
    val serial: String
)