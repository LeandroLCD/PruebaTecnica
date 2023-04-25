package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class CashDrawer(
    @SerializedName("id")
    val id: Int,
    @SerializedName("option")
    val option: String
)