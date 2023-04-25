package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class Tip(
    @SerializedName("id")
    val id: Int,
    @SerializedName("tip")
    val tip: Double
)