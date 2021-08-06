package com.nxzzld.nothingappication.base

data class PagerUIModel<T>(
    val showLoading: Boolean,
    val showError: String?,
    val showSuccess: List<T>?,
    val showEnd: Boolean,
    val isRefresh: Boolean,
    val isEmpty: Boolean = false
)