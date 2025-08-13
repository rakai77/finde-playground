package org.example.finde_project

import android.os.Build
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.engine.okhttp.OkHttp

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
    override val os: String = "Android"
    override fun isDebugMode() = true
    override fun getHttpEngine(forMultipartData: Boolean): HttpClient {
        return if (forMultipartData) HttpClient(CIO) else HttpClient(OkHttp) {
            engine {
                config {
                    retryOnConnectionFailure(true)
                    followRedirects(true)
                }
            }
        }
    }
}

actual fun getPlatform(): Platform = AndroidPlatform()