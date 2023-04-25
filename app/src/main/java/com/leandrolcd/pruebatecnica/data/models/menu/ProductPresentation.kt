package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class ProductPresentation(
    @SerializedName("active")
    val active: Int,
    @SerializedName("code")
    val code: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String?,
    @SerializedName("price")
    val price: Double,
    @SerializedName("product_id")
    val productId: Int,
    @SerializedName("sku")
    val sku: String?,
    @SerializedName("stock")
    val stock: Int?
)