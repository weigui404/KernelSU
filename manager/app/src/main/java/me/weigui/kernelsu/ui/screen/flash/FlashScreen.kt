package me.weigui.kernelsu.ui.screen.flash

import androidx.compose.runtime.Composable
import me.weigui.kernelsu.ui.LocalUiMode
import me.weigui.kernelsu.ui.UiMode

@Composable
fun FlashScreen(flashIt: FlashIt) {
    when (LocalUiMode.current) {
        UiMode.Miuix -> FlashScreenMiuix(flashIt)
        UiMode.Material -> FlashScreenMaterial(flashIt)
    }
}
