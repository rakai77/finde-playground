package org.example.finde_project.remote.service

import org.example.finde_project.remote.Endpoint
import org.example.finde_project.remote.response.AllTrendingResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.url

class HomeServiceImpl(
    private val httpClient: HttpClient,
) : HomeService {
    override suspend fun getAllTrending(): AllTrendingResponse {
        return httpClient.get {
            url(Endpoint.ALL_TRENDING)
        }.body()
    }
}