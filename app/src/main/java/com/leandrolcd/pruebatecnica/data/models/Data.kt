package com.leandrolcd.pruebatecnica.data.models


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("activation")
    val activation: Activation,
    @SerializedName("customer")
    val customer: Customer,
    @SerializedName("langs")
    val langs: List<Lang>,
    @SerializedName("magensa_keys")
    val magensaKeys: MagensaKeys,
    @SerializedName("terminals")
    val terminals: List<Terminal>,
    @SerializedName("venue")
    val venue: Venue
)