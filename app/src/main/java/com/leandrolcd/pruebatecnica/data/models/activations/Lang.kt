package com.leandrolcd.pruebatecnica.data.models.activations


import com.google.gson.annotations.SerializedName

data class Lang(
    @SerializedName("code")
    val code: String,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("display_name")
    val displayName: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("pivot")
    val pivot: Pivot,
    @SerializedName("updated_at")
    val updatedAt: String
)