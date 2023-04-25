package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class TaxesTaxesGroup(
    @SerializedName("tax_group_id")
    val taxGroupId: Int,
    @SerializedName("tax_id")
    val taxId: Int
)