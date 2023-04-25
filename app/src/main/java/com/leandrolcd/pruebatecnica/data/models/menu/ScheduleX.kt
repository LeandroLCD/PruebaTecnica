package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class ScheduleX(
    @SerializedName("close")
    val close: String,
    @SerializedName("closed")
    val closed: Int,
    @SerializedName("day_of_week")
    val dayOfWeek: String,
    @SerializedName("open")
    val `open`: String,
    @SerializedName("venue_id")
    val venueId: Int
)