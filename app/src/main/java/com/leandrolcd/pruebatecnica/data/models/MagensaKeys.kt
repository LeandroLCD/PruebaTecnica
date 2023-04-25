package com.leandrolcd.pruebatecnica.data.models


import com.google.gson.annotations.SerializedName

data class MagensaKeys(
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("deleted_at")
    val deletedAt: Any?,
    @SerializedName("id")
    val id: Int,
    @SerializedName("magensa_customer_code")
    val magensaCustomerCode: String,
    @SerializedName("magensa_password")
    val magensaPassword: String,
    @SerializedName("magensa_processor_name")
    val magensaProcessorName: String,
    @SerializedName("magensa_url")
    val magensaUrl: String,
    @SerializedName("magensa_username")
    val magensaUsername: String,
    @SerializedName("updated_at")
    val updatedAt: String,
    @SerializedName("venue_id")
    val venueId: Int
)