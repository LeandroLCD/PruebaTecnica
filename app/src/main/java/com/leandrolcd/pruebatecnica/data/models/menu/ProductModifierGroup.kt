package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class ProductModifierGroup(
    @SerializedName("modifier_group_id")
    val modifierGroupId: Int,
    @SerializedName("product_id")
    val productId: Int
)