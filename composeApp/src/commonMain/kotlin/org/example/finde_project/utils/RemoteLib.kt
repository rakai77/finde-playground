package org.example.finde_project.utils

import io.ktor.client.HttpClient
import io.ktor.client.plugins.HttpRedirect
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.auth.Auth
import io.ktor.client.plugins.auth.providers.BearerTokens
import io.ktor.client.plugins.auth.providers.bearer
import io.ktor.client.plugins.compression.ContentEncoding
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.plugins.logging.SIMPLE
import io.ktor.http.URLProtocol
import io.ktor.http.parameters
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

fun setupHttpClient(
    baseUrl: String,
    isDebugMode: Boolean = false,
    httpClientProvider: HttpClient
) : HttpClient {

    return httpClientProvider.config {
        ContentEncoding()

        expectSuccess = true

        install(HttpTimeout) {
            this.requestTimeoutMillis = 60_000
            this.connectTimeoutMillis = 60_000
            this.socketTimeoutMillis = 60_000
        }

        install(ContentNegotiation) {
            json(Json {
                isLenient = true
                ignoreUnknownKeys = true
                prettyPrint = true
                useAlternativeNames = false
                explicitNulls = false
            })
        }

        install(HttpRedirect) {
            checkHttpMethod = true
        }

        install(Auth) {
            bearer {
                loadTokens {
                    BearerTokens(
                        "eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI2MDRkMDZjNjA1YTI3OTRjZjc0ZWFmODUyMGJhNTFiZCIsIm5iZiI6MTczNzM2ODgyOS43NTgwMDAxLCJzdWIiOiI2NzhlMjRmZDQyZjI3Yzc1NGM2NTQ5MmIiLCJzY29wZXMiOlsiYXBpX3JlYWQiXSwidmVyc2lvbiI6MX0.53FQqZAmj1XFy6WKvVlsPsVYd2NT6R2n_euvB6IfsDY",
                        ""
                    )
                }
                sendWithoutRequest { true }
            }
            parameters {
                append("api_key", "604d06c605a2794cf74eaf8520ba51bd")
            }
        }


        defaultRequest {
            host = baseUrl

            url {
                this.user
                protocol = URLProtocol.HTTPS
            }
        }

        if (isDebugMode) {
            install(Logging) {
                logger = Logger.SIMPLE
                level = LogLevel.ALL
            }
        }
    }
}