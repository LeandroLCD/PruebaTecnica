package com.leandrolcd.pruebatecnica.ui.menu.models

import com.google.gson.annotations.SerializedName

data class Product (
    val active: Int,
    val alias: String?,
    val description: String?,
    val hasLoyalty: Int,
    val id: Int,
    val isShortcut: Int,
    val labels: String?,
    val name: String,
    val order: Int?,
    val priceType: String,
    val recommended: Int,
    val reviews: Int,
    val serviceChargeActive: Int,
    val shortDescription: String?,
    val sku: String?,
    val updatedAt: String,
    val useDefaultTax: Int
)