package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class Schedule(
    @SerializedName("category_id")
    val categoryId: Int,
    @SerializedName("close")
    val close: String,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("day_of_week")
    val dayOfWeek: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("open")
    val `open`: String,
    @SerializedName("updated_at")
    val updatedAt: String
)