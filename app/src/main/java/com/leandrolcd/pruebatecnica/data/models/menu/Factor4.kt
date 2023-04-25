package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class Factor4(
    @SerializedName("default_value")
    val defaultValue: String,
    @SerializedName("id")
    val id: Int
)