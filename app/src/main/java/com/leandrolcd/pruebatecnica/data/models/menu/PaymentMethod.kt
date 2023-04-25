package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class PaymentMethod(
    @SerializedName("display_name")
    val displayName: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String
)