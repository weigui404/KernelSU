package me.weigui.kernelsu.ui.screen.templateeditor

import androidx.compose.runtime.Composable
import me.weigui.kernelsu.ui.LocalUiMode
import me.weigui.kernelsu.ui.UiMode

@Composable
fun TemplateEditorScreen(template: me.weigui.kernelsu.ui.viewmodel.TemplateViewModel.TemplateInfo, readOnly: Boolean) {
    when (LocalUiMode.current) {
        UiMode.Miuix -> TemplateEditorScreenMiuix(template, readOnly)
        UiMode.Material -> TemplateEditorScreenMaterial(template, readOnly)
    }
}
