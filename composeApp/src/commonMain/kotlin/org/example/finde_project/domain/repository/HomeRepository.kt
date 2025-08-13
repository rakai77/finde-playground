package org.example.finde_project.domain.repository

import org.example.finde_project.remote.response.AllTrendingResponse

interface HomeRepository {
    suspend fun getAllTrending() : AllTrendingResponse
}