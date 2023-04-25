package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class Printer(
    @SerializedName("brand_id")
    val brandId: Int?,
    @SerializedName("brand_printers")
    val brandPrinters: BrandPrinters?,
    @SerializedName("id")
    val id: Int,
    @SerializedName("ip")
    val ip: String,
    @SerializedName("name")
    val name: String?,
    @SerializedName("port")
    val port: Int,
    @SerializedName("printer_size")
    val printerSize: Int,
    @SerializedName("type_printer")
    val typePrinter: String?
)