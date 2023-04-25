package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class ProductCategory(
    @SerializedName("category_id")
    val categoryId: Int,
    @SerializedName("product_id")
    val productId: Int
)