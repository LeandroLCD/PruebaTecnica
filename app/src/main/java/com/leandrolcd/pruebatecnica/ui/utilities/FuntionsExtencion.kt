package com.leandrolcd.pruebatecnica.ui.utilities

import com.leandrolcd.pruebatecnica.data.models.menu.MenuResponse
import com.leandrolcd.pruebatecnica.ui.menu.models.Category
import com.leandrolcd.pruebatecnica.ui.menu.models.Product

fun MenuResponse.toCategoryList(): List<Category> {
    // Create a map of product IDs to category IDs
    val productCategoryMap = this.data.productCategory.associate { it.productId to it.categoryId }

    // Group products by category ID
    val productsByCategory = this.data.products.groupBy { productCategoryMap[it.id] }

    // Build a list of Category objects with associated products
    return this.data.categories.map { categoryDTO ->
        Category(
            active = categoryDTO.active,
            color = categoryDTO.color,
            hideMenu = categoryDTO.hideMenu,
            id = categoryDTO.id,
            image = categoryDTO.image,
            name = categoryDTO.name,
            order = categoryDTO.order,
            parentId = categoryDTO.parentId,
            schedules = categoryDTO.schedules,
            updatedAt = categoryDTO.updatedAt,
            products = productsByCategory[categoryDTO.id]?.map { productDTO ->
                Product(
                    active = productDTO.active,
                            alias = productDTO.alias,
                            description = productDTO.description,
                            hasLoyalty = productDTO.hasLoyalty,
                            id = productDTO.id,
                            isShortcut = productDTO.isShortcut,
                            labels = productDTO.labels,
                            name = productDTO.name,
                            order = productDTO.order,
                            priceType = productDTO.priceType,
                            recommended = productDTO.recommended,
                            reviews = productDTO.reviews,
                            serviceChargeActive = productDTO.serviceChargeActive,
                            shortDescription = productDTO.shortDescription,
                            sku = productDTO.sku,
                            updatedAt = productDTO.updatedAt,
                            useDefaultTax = productDTO.useDefaultTax
                )
            }
        )
    }
}