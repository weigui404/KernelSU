package me.weigui.kernelsu.ui.screen.home

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import me.weigui.kernelsu.ui.LocalUiMode
import me.weigui.kernelsu.ui.UiMode
import me.weigui.kernelsu.ui.navigation3.Navigator

@Composable
fun HomePager(
    navigator: Navigator,
    bottomInnerPadding: Dp
) {
    when (LocalUiMode.current) {
        UiMode.Miuix -> HomePagerMiuix(navigator, bottomInnerPadding)
        UiMode.Material -> HomePagerMaterial(navigator, bottomInnerPadding)
    }
}
