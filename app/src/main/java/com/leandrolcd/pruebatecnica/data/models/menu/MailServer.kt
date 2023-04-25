package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class MailServer(
    @SerializedName("server")
    val server: String
)