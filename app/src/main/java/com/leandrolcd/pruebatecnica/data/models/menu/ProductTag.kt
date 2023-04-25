package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class ProductTag(
    @SerializedName("product_id")
    val productId: Int,
    @SerializedName("tag_id")
    val tagId: Int
)