package com.leandrolcd.pruebatecnica.data.models


import com.google.gson.annotations.SerializedName

data class Terminal(
    @SerializedName("active")
    val active: Int,
    @SerializedName("auth_key")
    val authKey: String?,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("customer_id")
    val customerId: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("print_this")
    val printThis: Int,
    @SerializedName("register_id")
    val registerId: String,
    @SerializedName("tpn")
    val tpn: String?,
    @SerializedName("type")
    val type: String,
    @SerializedName("updated_at")
    val updatedAt: String
)