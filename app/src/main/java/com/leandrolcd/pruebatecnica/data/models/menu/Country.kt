package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("cash_adjust_type")
    val cashAdjustType: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String
)