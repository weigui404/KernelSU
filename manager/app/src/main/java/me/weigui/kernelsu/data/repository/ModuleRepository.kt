package me.weigui.kernelsu.data.repository

import me.weigui.kernelsu.data.model.Module
import me.weigui.kernelsu.data.model.ModuleUpdateInfo

interface ModuleRepository {
    suspend fun getModules(): Result<List<Module>>
    suspend fun checkUpdate(module: Module): Result<ModuleUpdateInfo>
}
