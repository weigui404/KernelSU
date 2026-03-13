package me.weigui.kernelsu.ui.viewmodel

import me.weigui.kernelsu.data.model.TemplateInfo

data class TemplateUiState(
    val isRefreshing: Boolean = false,
    val templates: List<TemplateInfo> = emptyList(),
    val templateList: List<TemplateInfo> = emptyList(),
    val error: Throwable? = null
)
