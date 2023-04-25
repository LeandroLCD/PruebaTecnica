package com.leandrolcd.pruebatecnica.data.models.menu


import com.google.gson.annotations.SerializedName

data class PivotX(
    @SerializedName("employee_permission_id")
    val employeePermissionId: Int,
    @SerializedName("employee_role_id")
    val employeeRoleId: Int
)