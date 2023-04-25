package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class MultiMenuProduct(
    @SerializedName("multiple_menu_id")
    val multipleMenuId: Int,
    @SerializedName("product_id")
    val productId: Int
)