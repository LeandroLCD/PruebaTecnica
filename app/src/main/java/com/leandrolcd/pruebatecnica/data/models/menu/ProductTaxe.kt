package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class ProductTaxe(
    @SerializedName("product_id")
    val productId: Int,
    @SerializedName("tax_id")
    val taxId: Int
)