package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class ModifierGroup(
    @SerializedName("active")
    val active: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("max_allowed")
    val maxAllowed: Int,
    @SerializedName("min_required")
    val minRequired: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("order")
    val order: Int
)