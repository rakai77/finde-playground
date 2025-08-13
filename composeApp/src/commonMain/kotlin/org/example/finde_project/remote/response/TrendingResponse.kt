package org.example.finde_project.remote.response

import org.example.finde_project.domain.model.AllTrending
import org.example.finde_project.domain.model.AllTrendingItem
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AllTrendingResponse(
    @SerialName("page")
    val page: Int?,

    @SerialName("totalPages")
    val totalPages: Int?,

    @SerialName("results")
    val results: List<AllTrendingItemResponse>,

    @SerialName("totalResults")
    val totalResults: Int?
)

@Serializable
data class AllTrendingItemResponse(

    @SerialName("poster_path")
    val posterPath: String,

    @SerialName("backdrop_path")
    val backdropPath: String,

    @SerialName("media_type")
    val mediaType: String,

    @SerialName("original_name")
    val originalName: String? = null,

    @SerialName("name")
    val name: String? = null,

    @SerialName("id")
    val id: Int,

    @SerialName("original_title")
    val originalTitle: String? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("release_date")
    val releaseDate: String? = null,

    @SerialName("first_air_date")
    val firstAirDate: String? = null
)

fun AllTrendingResponse.toDomain() = AllTrending(
    totalPages = this.totalPages ?: 1,
    page = this.page ?: 0,
    results = this.results.map { it.toDomain() },
    totalResults = this.totalResults ?: 0
)

fun AllTrendingItemResponse.toDomain() = AllTrendingItem(
    posterPath = this.posterPath,
    backdropPath = this.backdropPath,
    mediaType = this.mediaType,
    originalName = this.originalName ?: "",
    name = this.name ?: "",
    id = this.id,
    originalTitle = this.originalTitle ?: "",
    title = this.title ?: "",
    releaseDate = this.releaseDate ?: "",
    firstAirDate = this.firstAirDate ?: ""
)