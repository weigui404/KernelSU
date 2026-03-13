package me.weigui.kernelsu.ui.screen.template

import androidx.compose.runtime.Composable
import me.weigui.kernelsu.ui.LocalUiMode
import me.weigui.kernelsu.ui.UiMode

@Composable
fun AppProfileTemplateScreen() {
    when (LocalUiMode.current) {
        UiMode.Miuix -> AppProfileTemplateScreenMiuix()
        UiMode.Material -> AppProfileTemplateScreenMaterial()
    }
}
