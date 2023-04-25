package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class Product(
    @SerializedName("active")
    val active: Int,
    @SerializedName("alias")
    val alias: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("has_loyalty")
    val hasLoyalty: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("is_shortcut")
    val isShortcut: Int,
    @SerializedName("labels")
    val labels: String?,
    @SerializedName("name")
    val name: String,
    @SerializedName("order")
    val order: Int?,
    @SerializedName("price_type")
    val priceType: String,
    @SerializedName("recommended")
    val recommended: Int,
    @SerializedName("reviews")
    val reviews: Int,
    @SerializedName("service_charge_active")
    val serviceChargeActive: Int,
    @SerializedName("short_description")
    val shortDescription: String?,
    @SerializedName("sku")
    val sku: String?,
    @SerializedName("updated_at")
    val updatedAt: String,
    @SerializedName("use_default_tax")
    val useDefaultTax: Int
)