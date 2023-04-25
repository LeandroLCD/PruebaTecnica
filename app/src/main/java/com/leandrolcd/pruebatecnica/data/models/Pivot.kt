package com.leandrolcd.pruebatecnica.data.models


import com.google.gson.annotations.SerializedName

data class Pivot(
    @SerializedName("lang_id")
    val langId: Int,
    @SerializedName("venue_id")
    val venueId: Int
)