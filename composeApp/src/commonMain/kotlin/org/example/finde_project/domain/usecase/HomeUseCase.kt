package org.example.finde_project.domain.usecase

import org.example.finde_project.remote.response.toDomain
import org.example.finde_project.domain.model.AllTrending
import org.example.finde_project.domain.repository.HomeRepository
import org.example.finde_project.utils.execute
import kotlinx.coroutines.flow.Flow

class HomeUseCase(
    private val homeRepository: HomeRepository,
) {
    suspend fun getAllTrending() : Flow<AllTrending> {
        return execute { homeRepository.getAllTrending().toDomain() }
    }
}