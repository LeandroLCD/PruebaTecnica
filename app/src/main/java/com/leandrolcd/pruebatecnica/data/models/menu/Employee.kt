package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class Employee(
    @SerializedName("access_ground_control")
    val accessGroundControl: Int,
    @SerializedName("active")
    val active: Int,
    @SerializedName("address")
    val address: String?,
    @SerializedName("city")
    val city: String?,
    @SerializedName("country")
    val country: String?,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("deleted_at")
    val deletedAt: Any?,
    @SerializedName("device_id")
    val deviceId: Any?,
    @SerializedName("editable")
    val editable: Any?,
    @SerializedName("email")
    val email: String?,
    @SerializedName("employee_role_id")
    val employeeRoleId: Int,
    @SerializedName("first_name")
    val firstName: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("last_name")
    val lastName: String?,
    @SerializedName("mobile")
    val mobile: String?,
    @SerializedName("multiple_menu_id")
    val multipleMenuId: Int?,
    @SerializedName("name")
    val name: String,
    @SerializedName("pin")
    val pin: String,
    @SerializedName("state")
    val state: String?,
    @SerializedName("type")
    val type: String,
    @SerializedName("updated_at")
    val updatedAt: String?,
    @SerializedName("user_7shifts")
    val user7shifts: Int,
    @SerializedName("venue_id")
    val venueId: Int,
    @SerializedName("zip")
    val zip: String?
)