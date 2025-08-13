package org.example.finde_project.presentation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import org.example.finde_project.presentation.navigation.MainNavigation
import org.example.finde_project.presentation.screen.HomeScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun MainScreen() {

    val navController = rememberNavController()

    MaterialTheme {
        MainNavigation(navController = navController)
    }
}