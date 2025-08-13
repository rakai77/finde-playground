package org.example.finde_project.di

import org.example.finde_project.remote.service.HomeService
import org.example.finde_project.remote.service.HomeServiceImpl
import org.example.finde_project.domain.repository.HomeRepository
import org.example.finde_project.domain.repository.HomeRepositoryImpl
import org.example.finde_project.domain.usecase.HomeUseCase
import org.example.finde_project.utils.setupHttpClient
import org.example.finde_project.getPlatform
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

fun initKoinModule(appDeclaration: KoinAppDeclaration = {}) {
    runCatching { stopKoin() }
    startKoin {
        appDeclaration()
        modules(remoteModule)
    }
}

val remoteModule = module {
    single {
        setupHttpClient(
            baseUrl = "https://api.themoviedb.org/3",
            isDebugMode = getPlatform().isDebugMode(),
            httpClientProvider = getPlatform().getHttpEngine()
        )
    }

    single<HomeService> { HomeServiceImpl(get()) }
    single<HomeRepository> { HomeRepositoryImpl(get()) }
    single { HomeUseCase(get()) }

}

//val viewModel = module {
//    viewModel { MainViewModel(get()) }
//    viewModel { HomeViewModel(get()) }
//}