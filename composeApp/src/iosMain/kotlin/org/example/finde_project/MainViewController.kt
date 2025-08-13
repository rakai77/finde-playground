package org.example.finde_project

import androidx.compose.ui.window.ComposeUIViewController
import org.example.finde_project.di.initKoinModule
import org.example.finde_project.presentation.MainScreen

fun MainViewController() = ComposeUIViewController(configure = { initKoinModule {  } }) { MainScreen() }