package org.example.finde_project.domain.repository

import org.example.finde_project.remote.response.AllTrendingResponse
import org.example.finde_project.remote.service.HomeService

class HomeRepositoryImpl(
    private val homeService: HomeService,
) : HomeRepository {
    override suspend fun getAllTrending(): AllTrendingResponse = homeService.getAllTrending()
}