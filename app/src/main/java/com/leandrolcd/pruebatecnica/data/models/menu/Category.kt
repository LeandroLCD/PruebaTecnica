package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class Category(
    @SerializedName("active")
    val active: String,
    @SerializedName("color")
    val color: String,
    @SerializedName("hide_menu")
    val hideMenu: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("order")
    val order: Int?,
    @SerializedName("parent_id")
    val parentId: Int?,
    @SerializedName("schedules")
    val schedules: List<Schedule>,
    @SerializedName("updated_at")
    val updatedAt: String
)