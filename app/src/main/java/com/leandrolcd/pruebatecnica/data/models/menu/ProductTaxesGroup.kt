package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class ProductTaxesGroup(
    @SerializedName("product_id")
    val productId: Int,
    @SerializedName("tax_group_id")
    val taxGroupId: Int
)