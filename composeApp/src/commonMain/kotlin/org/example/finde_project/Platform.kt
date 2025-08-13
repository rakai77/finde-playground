package org.example.finde_project

import io.ktor.client.HttpClient

interface Platform {
    val name: String
    val os: String
    fun isDebugMode(): Boolean
    fun getHttpEngine(forMultipartData: Boolean = false): HttpClient
}

expect fun getPlatform(): Platform