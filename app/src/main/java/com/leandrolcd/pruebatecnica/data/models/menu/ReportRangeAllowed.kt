package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class ReportRangeAllowed(
    @SerializedName("last_week")
    val lastWeek: Boolean,
    @SerializedName("open")
    val `open`: Boolean,
    @SerializedName("today")
    val today: Boolean,
    @SerializedName("yesterday")
    val yesterday: Boolean
)