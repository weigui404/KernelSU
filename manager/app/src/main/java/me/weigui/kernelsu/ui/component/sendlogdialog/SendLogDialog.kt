package me.weigui.kernelsu.ui.component.sendlogdialog

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import me.weigui.kernelsu.ui.LocalUiMode
import me.weigui.kernelsu.ui.UiMode
import me.weigui.kernelsu.ui.component.dialog.LoadingDialogHandle

@Composable
fun SendLogDialog(
    showDialog: MutableState<Boolean>,
    loadingDialog: LoadingDialogHandle
) {
    when (LocalUiMode.current) {
        UiMode.Miuix -> SendLogDialogMiuix(showDialog, loadingDialog)
        UiMode.Material -> SendLogDialogMaterial(showDialog, loadingDialog)
    }
}
