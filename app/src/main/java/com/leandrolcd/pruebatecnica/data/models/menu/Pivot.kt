package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class Pivot(
    @SerializedName("area_id")
    val areaId: Int,
    @SerializedName("height")
    val height: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("map_object_id")
    val mapObjectId: Int,
    @SerializedName("rotation")
    val rotation: Int,
    @SerializedName("width")
    val width: Int,
    @SerializedName("x")
    val x: Int,
    @SerializedName("y")
    val y: Int
)