package org.example.finde_project.remote.service

import org.example.finde_project.remote.response.AllTrendingResponse

interface HomeService {
    suspend fun getAllTrending() : AllTrendingResponse
}