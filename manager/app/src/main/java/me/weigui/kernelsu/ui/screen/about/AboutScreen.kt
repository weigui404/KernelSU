package me.weigui.kernelsu.ui.screen.about

import androidx.compose.runtime.Composable
import me.weigui.kernelsu.ui.LocalUiMode
import me.weigui.kernelsu.ui.UiMode

@Composable
fun AboutScreen() {
    when (LocalUiMode.current) {
        UiMode.Miuix -> AboutScreenMiuix()
        UiMode.Material -> AboutScreenMaterial()
    }
}
