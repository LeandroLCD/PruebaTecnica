package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class TipPooling(
    @SerializedName("contributor")
    val contributor: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("percentage")
    val percentage: Double,
    @SerializedName("slug")
    val slug: String
)