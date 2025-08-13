package org.example.finde_project

import androidx.compose.ui.window.ComposeUIViewController
import org.example.finde_project.di.initKoinModule

fun MainViewController() = ComposeUIViewController(configure = { initKoinModule {  } }) { App() }