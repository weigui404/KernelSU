package me.weigui.kernelsu.ui.screen.executemoduleaction

import androidx.compose.runtime.Composable
import me.weigui.kernelsu.ui.LocalUiMode
import me.weigui.kernelsu.ui.UiMode

@Composable
fun ExecuteModuleActionScreen(moduleId: String) {
    when (LocalUiMode.current) {
        UiMode.Miuix -> ExecuteModuleActionScreenMiuix(moduleId)
        UiMode.Material -> ExecuteModuleActionScreenMaterial(moduleId)
    }
}
