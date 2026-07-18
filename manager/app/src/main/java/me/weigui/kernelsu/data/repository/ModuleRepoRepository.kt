package me.weigui.kernelsu.data.repository

import me.weigui.kernelsu.data.model.RepoModule

interface ModuleRepoRepository {
    suspend fun fetchModules(): Result<List<RepoModule>>
}
