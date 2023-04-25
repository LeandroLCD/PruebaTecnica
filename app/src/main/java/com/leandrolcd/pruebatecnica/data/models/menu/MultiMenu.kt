package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class MultiMenu(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String
)