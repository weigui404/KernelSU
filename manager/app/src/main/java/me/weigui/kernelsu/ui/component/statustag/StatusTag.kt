package me.weigui.kernelsu.ui.component.statustag

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import me.weigui.kernelsu.ui.LocalUiMode
import me.weigui.kernelsu.ui.UiMode

@Composable
fun StatusTag(
    label: String,
    modifier: Modifier = Modifier,
    backgroundColor: Color,
    contentColor: Color
) {
    when (LocalUiMode.current) {
        UiMode.Miuix -> StatusTagMiuix(label, backgroundColor, contentColor)
        UiMode.Material -> StatusTagMaterial(label, modifier, backgroundColor, contentColor)
    }
}
