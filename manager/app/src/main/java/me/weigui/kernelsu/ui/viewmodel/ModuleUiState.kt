package me.weigui.kernelsu.ui.viewmodel

import me.weigui.kernelsu.data.model.Module
import me.weigui.kernelsu.data.model.ModuleUpdateInfo
import me.weigui.kernelsu.ui.component.SearchStatus

data class ModuleUiState(
    val isRefreshing: Boolean = false,
    val modules: List<Module> = emptyList(),
    val moduleList: List<Module> = emptyList(),
    val updateInfo: Map<String, ModuleUpdateInfo> = emptyMap(),
    val searchStatus: SearchStatus = SearchStatus(""),
    val searchResults: List<Module> = emptyList(),
    val sortEnabledFirst: Boolean = false,
    val sortActionFirst: Boolean = false,
    val checkModuleUpdate: Boolean = true
)
