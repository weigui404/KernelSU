package me.weigui.kernelsu.ui.viewmodel

import androidx.compose.runtime.Immutable
import me.weigui.kernelsu.ui.UiMode
import me.weigui.kernelsu.ui.theme.AppSettings

@Immutable
data class MainActivityUiState(
    val appSettings: AppSettings,
    val pageScale: Float,
    val enableBlur: Boolean,
    val enableFloatingBottomBar: Boolean,
    val enableFloatingBottomBarBlur: Boolean,
    val uiMode: UiMode,
)
