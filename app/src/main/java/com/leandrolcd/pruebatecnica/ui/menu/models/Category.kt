package com.leandrolcd.pruebatecnica.ui.menu.models

import com.leandrolcd.pruebatecnica.data.models.menu.Schedule


data class Category(
    val active: String,
    val color: String,
    val hideMenu: Int,
    val id: Int,
    val image: String,
    val name: String,
    val order: Int?,
    val parentId: Int?,
    val schedules: List<Schedule>,
    val updatedAt: String,
    var products:List<Product>?
    )
