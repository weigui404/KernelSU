package me.weigui.kernelsu.ui.screen.install

import androidx.compose.runtime.Composable
import me.weigui.kernelsu.ui.LocalUiMode
import me.weigui.kernelsu.ui.UiMode

@Composable
fun InstallScreen() {
    when (LocalUiMode.current) {
        UiMode.Miuix -> InstallScreenMiuix()
        UiMode.Material -> InstallScreenMaterial()
    }
}
