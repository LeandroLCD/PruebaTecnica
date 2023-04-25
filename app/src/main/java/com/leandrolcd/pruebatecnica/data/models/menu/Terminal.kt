package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class Terminal(
    @SerializedName("ip")
    val ip: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("type")
    val type: String
)