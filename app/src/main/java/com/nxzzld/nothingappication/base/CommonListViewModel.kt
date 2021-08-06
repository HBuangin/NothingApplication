package com.nxzzld.nothingappication.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData

abstract class CommonListViewModel<T> : BaseViewModel() {
    val _uiState = MediatorLiveData<PagerUIModel<T>>()
    val uiState: LiveData<PagerUIModel<T>>
        get() = _uiState
    var currentPage = 1

    fun dealPaging(isRefresh: Boolean, pagingEntity: PagingEntity<T>) {
        when {
            pagingEntity.pages == 0 -> emitUIState(
                    showLoading = false,
                    isRefresh = isRefresh, 
                    isEmpty = true,
                    showSuccess = pagingEntity.records
            )
            pagingEntity.pages > currentPage -> {
                emitUIState(
                        showLoading = false,
                        showEnd = pagingEntity.records.size < 10,
                        isRefresh = isRefresh,
                        isEmpty = false,
                        showSuccess = pagingEntity.records
                )
                currentPage++
            }
            pagingEntity.pages <= currentPage -> emitUIState(
                    isEmpty = false,
                    showLoading = false,
                    showEnd = true,
                    isRefresh = isRefresh,
                    showSuccess = pagingEntity.records
            )
        }
    }

    fun emitUIState(
            showLoading: Boolean = false,
            showError: String? = null,
            showSuccess: List<T>? = null,
            showEnd: Boolean = false,
            isRefresh: Boolean = false,
            isEmpty: Boolean = false
    ) {
        val uiModel =
                PagerUIModel(showLoading, showError, showSuccess, showEnd, isRefresh, isEmpty)
        _uiState.value = uiModel
    }
}