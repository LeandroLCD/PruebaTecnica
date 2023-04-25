package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class Modifier(
    @SerializedName("active")
    val active: Int,
    @SerializedName("extra_price")
    val extraPrice: Double,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("modifier_group_id")
    val modifierGroupId: Int,
    @SerializedName("order")
    val order: Int?,
    @SerializedName("pos_name")
    val posName: String,
    @SerializedName("price")
    val price: Double,
    @SerializedName("selected")
    val selected: Int
)