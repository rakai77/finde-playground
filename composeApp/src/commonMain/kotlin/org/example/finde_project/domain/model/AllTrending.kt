package org.example.finde_project.domain.model

data class AllTrending(
    val page: Int = 0,
    val totalPages: Int = 0,
    val results: List<AllTrendingItem> = emptyList(),
    val totalResults: Int = 0
)

data class AllTrendingItem(
    val posterPath: String = "",
    val backdropPath: String = "",
    val mediaType: String = "",
    val originalName: String = "",
    val name: String = "",
    val id: Int = 0,
    val originalTitle: String = "",
    val title: String = "",
    val releaseDate: String = "",
    val firstAirDate: String = "",
    var isActive: Boolean = false
)