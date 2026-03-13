package me.weigui.kernelsu.ui.component.uninstalldialog

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import me.weigui.kernelsu.ui.LocalUiMode
import me.weigui.kernelsu.ui.UiMode
import me.weigui.kernelsu.ui.navigation3.Navigator

@Composable
fun UninstallDialog(
    showDialog: MutableState<Boolean>,
    navigator: Navigator
) {
    when (LocalUiMode.current) {
        UiMode.Miuix -> UninstallDialogMiuix(showDialog, navigator)
        UiMode.Material -> UninstallDialogMaterial(showDialog, navigator)
    }
}
