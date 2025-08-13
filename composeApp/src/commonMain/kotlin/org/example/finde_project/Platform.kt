package org.example.finde_project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform