package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class Area(
    @SerializedName("color")
    val color: String?,
    @SerializedName("height")
    val height: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("map_objects")
    val mapObjects: List<MapObject>,
    @SerializedName("name")
    val name: String,
    @SerializedName("width")
    val width: Int
)