package com.leandrolcd.pruebatecnica.data.models


import com.google.gson.annotations.SerializedName

data class Venue(
    @SerializedName("active")
    val active: Int,
    @SerializedName("address")
    val address: String,
    @SerializedName("advertising_banner")
    val advertisingBanner: String,
    @SerializedName("allow_report_user")
    val allowReportUser: Int,
    @SerializedName("api_factor4")
    val apiFactor4: Int,
    @SerializedName("api_marketman")
    val apiMarketman: Int,
    @SerializedName("api_shifts")
    val apiShifts: Int,
    @SerializedName("app_cause")
    val appCause: String,
    @SerializedName("app_ordering")
    val appOrdering: Int,
    @SerializedName("banner")
    val banner: String,
    @SerializedName("cash_discount_active")
    val cashDiscountActive: Int,
    @SerializedName("cash_discount_amount")
    val cashDiscountAmount: Double,
    @SerializedName("cash_discount_title")
    val cashDiscountTitle: String,
    @SerializedName("cash_discount_type")
    val cashDiscountType: Int,
    @SerializedName("closing_time")
    val closingTime: String,
    @SerializedName("company_id")
    val companyId: Int,
    @SerializedName("contact_person")
    val contactPerson: String,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("customer")
    val customer: Customer,
    @SerializedName("customer_id")
    val customerId: Int,
    @SerializedName("default_loyalty_value")
    val defaultLoyaltyValue: Double,
    @SerializedName("default_starting_cash")
    val defaultStartingCash: Int,
    @SerializedName("default_tax")
    val defaultTax: Double,
    @SerializedName("delivery_time")
    val deliveryTime: String,
    @SerializedName("description")
    val description: Any?,
    @SerializedName("discount_only_admin")
    val discountOnlyAdmin: Int,
    @SerializedName("email")
    val email: String,
    @SerializedName("email_report")
    val emailReport: Int,
    @SerializedName("express_fee")
    val expressFee: Int,
    @SerializedName("has_loyalty")
    val hasLoyalty: Int,
    @SerializedName("hide_tables")
    val hideTables: Int,
    @SerializedName("hours")
    val hours: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("invoice_message")
    val invoiceMessage: String,
    @SerializedName("json_shifts")
    val jsonShifts: String,
    @SerializedName("kds_enable")
    val kdsEnable: Int,
    @SerializedName("kds_sms_status")
    val kdsSmsStatus: Int,
    @SerializedName("key_shifts")
    val keyShifts: String,
    @SerializedName("keywords")
    val keywords: Any?,
    @SerializedName("kiosk_image")
    val kioskImage: String,
    @SerializedName("langs")
    val langs: List<LangX>,
    @SerializedName("location_id")
    val locationId: Int,
    @SerializedName("lock_tables")
    val lockTables: Int,
    @SerializedName("logo")
    val logo: String,
    @SerializedName("logo_web")
    val logoWeb: String,
    @SerializedName("modifiers_invoice")
    val modifiersInvoice: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("name_menu")
    val nameMenu: String,
    @SerializedName("online_payment")
    val onlinePayment: Int,
    @SerializedName("open_orders_device_report")
    val openOrdersDeviceReport: Int,
    @SerializedName("pax_transaction")
    val paxTransaction: Int,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("phone_venue")
    val phoneVenue: String,
    @SerializedName("print_instantly")
    val printInstantly: Int,
    @SerializedName("queue_banner")
    val queueBanner: String,
    @SerializedName("queue_video")
    val queueVideo: Any?,
    @SerializedName("requires_check_in")
    val requiresCheckIn: Int,
    @SerializedName("restaurant")
    val restaurant: Int,
    @SerializedName("screensaver_pax")
    val screensaverPax: String,
    @SerializedName("service_charge_active")
    val serviceChargeActive: Int,
    @SerializedName("service_charge_amount")
    val serviceChargeAmount: Double,
    @SerializedName("service_charge_title")
    val serviceChargeTitle: String,
    @SerializedName("service_fee")
    val serviceFee: Double,
    @SerializedName("service_fee_type")
    val serviceFeeType: String,
    @SerializedName("show_best_seller")
    val showBestSeller: Int,
    @SerializedName("show_recommended")
    val showRecommended: Int,
    @SerializedName("sms_limit")
    val smsLimit: Int,
    @SerializedName("sms_status")
    val smsStatus: Int,
    @SerializedName("sold_categories")
    val soldCategories: Int,
    @SerializedName("sold_items")
    val soldItems: Int,
    @SerializedName("splash_app")
    val splashApp: String,
    @SerializedName("support_phone")
    val supportPhone: String,
    @SerializedName("surcharge_type")
    val surchargeType: String,
    @SerializedName("tables")
    val tables: Int,
    @SerializedName("ticket_display")
    val ticketDisplay: String,
    @SerializedName("ticket_image")
    val ticketImage: String,
    @SerializedName("timezone")
    val timezone: String,
    @SerializedName("tips_prompt")
    val tipsPrompt: String,
    @SerializedName("update_whit_payer")
    val updateWhitPayer: Int,
    @SerializedName("updated_at")
    val updatedAt: String,
    @SerializedName("waiting_for_cooking")
    val waitingForCooking: Int,
    @SerializedName("web")
    val web: String
)