package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class Discount(
    @SerializedName("active")
    val active: Int,
    @SerializedName("complimentary")
    val complimentary: Int,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("deleted_at")
    val deletedAt: Any?,
    @SerializedName("discount")
    val discount: Double,
    @SerializedName("id")
    val id: Int,
    @SerializedName("order")
    val order: Int?,
    @SerializedName("reason")
    val reason: String,
    @SerializedName("require_pin")
    val requirePin: Int,
    @SerializedName("type")
    val type: String,
    @SerializedName("updated_at")
    val updatedAt: String,
    @SerializedName("venue_id")
    val venueId: Int
)