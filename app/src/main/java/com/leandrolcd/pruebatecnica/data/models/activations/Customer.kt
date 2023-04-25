package com.leandrolcd.pruebatecnica.data.models.activations


import com.google.gson.annotations.SerializedName

data class Customer(
    @SerializedName("active")
    val active: Int,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("updated_at")
    val updatedAt: String,
    @SerializedName("user_id")
    val userId: Int
)