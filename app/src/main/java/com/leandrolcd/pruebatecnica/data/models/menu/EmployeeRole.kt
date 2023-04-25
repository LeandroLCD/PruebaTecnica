package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class EmployeeRole(
    @SerializedName("active")
    val active: Int,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("display_name")
    val displayName: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("permissions")
    val permissions: List<Permission>,
    @SerializedName("updated_at")
    val updatedAt: String,
    @SerializedName("venue_id")
    val venueId: Int
)