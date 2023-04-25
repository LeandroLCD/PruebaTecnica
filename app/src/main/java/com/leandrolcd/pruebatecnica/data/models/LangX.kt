package com.leandrolcd.pruebatecnica.data.models


import com.google.gson.annotations.SerializedName

data class LangX(
    @SerializedName("code")
    val code: String,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("display_name")
    val displayName: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("updated_at")
    val updatedAt: String
)