package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class PrinterTag(
    @SerializedName("printer_id")
    val printerId: Int,
    @SerializedName("tag_id")
    val tagId: Int
)