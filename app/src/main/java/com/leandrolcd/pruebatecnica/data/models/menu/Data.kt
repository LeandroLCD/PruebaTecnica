package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("areas")
    val areas: List<Area>,
    @SerializedName("cash_drawers")
    val cashDrawers: List<CashDrawer>,
    @SerializedName("categories")
    val categories: List<Category>,
    @SerializedName("discounts")
    val discounts: List<Discount>,
    @SerializedName("employee_roles")
    val employeeRoles: List<EmployeeRole>,
    @SerializedName("employees")
    val employees: List<Employee>,
    @SerializedName("factor4")
    val factor4: List<Factor4>,
    @SerializedName("magensa_keys")
    val magensaKeys: MagensaKeys,
    @SerializedName("mail_servers")
    val mailServers: List<MailServer>,
    @SerializedName("modifier_groups")
    val modifierGroups: List<ModifierGroup>,
    @SerializedName("modifiers")
    val modifiers: List<Modifier>,
    @SerializedName("multi_menu")
    val multiMenu: List<MultiMenu>,
    @SerializedName("multi_menu_products")
    val multiMenuProducts: List<MultiMenuProduct>,
    @SerializedName("multimedia")
    val multimedia: List<Multimedia>,
    @SerializedName("order_types")
    val orderTypes: List<OrderType>,
    @SerializedName("payment_methods")
    val paymentMethods: List<PaymentMethod>,
    @SerializedName("printer_tags")
    val printerTags: List<PrinterTag>,
    @SerializedName("printers")
    val printers: List<Printer>,
    @SerializedName("product_category")
    val productCategory: List<ProductCategory>,
    @SerializedName("product_modifier_group")
    val productModifierGroup: List<ProductModifierGroup>,
    @SerializedName("product_presentations")
    val productPresentations: List<ProductPresentation>,
    @SerializedName("product_tags")
    val productTags: List<ProductTag>,
    @SerializedName("product_taxes")
    val productTaxes: List<ProductTaxe>,
    @SerializedName("product_taxes_group")
    val productTaxesGroup: List<ProductTaxesGroup>,
    @SerializedName("products")
    val products: List<Product>,
    @SerializedName("report_range_allowed")
    val reportRangeAllowed: ReportRangeAllowed,
    @SerializedName("tags")
    val tags: List<Tag>,
    @SerializedName("taxes")
    val taxes: List<Taxe>,
    @SerializedName("taxes_group")
    val taxesGroup: List<TaxesGroup>,
    @SerializedName("taxes_taxes_groups")
    val taxesTaxesGroups: List<TaxesTaxesGroup>,
    @SerializedName("terminal")
    val terminal: Terminal,
    @SerializedName("tip_pooling")
    val tipPooling: List<TipPooling>,
    @SerializedName("tips")
    val tips: List<Tip>,
    @SerializedName("venue")
    val venue: Venue
)