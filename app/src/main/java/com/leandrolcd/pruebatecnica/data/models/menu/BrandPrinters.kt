package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class BrandPrinters(
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("display_name")
    val displayName: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("printer_port")
    val printerPort: Int,
    @SerializedName("protocol")
    val protocol: String?,
    @SerializedName("updated_at")
    val updatedAt: Any?
)