package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class Multimedia(
    @SerializedName("featured")
    val featured: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("order")
    val order: Int?,
    @SerializedName("product_id")
    val productId: Int,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)