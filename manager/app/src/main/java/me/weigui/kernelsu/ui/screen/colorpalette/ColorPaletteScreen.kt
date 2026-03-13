package me.weigui.kernelsu.ui.screen.colorpalette

import androidx.compose.runtime.Composable
import me.weigui.kernelsu.ui.LocalUiMode
import me.weigui.kernelsu.ui.UiMode

@Composable
fun ColorPaletteScreen() {
    when (LocalUiMode.current) {
        UiMode.Miuix -> ColorPaletteScreenMiuix()
        UiMode.Material -> ColorPaletteScreenMaterial()
    }
}
