package org.example.finde_project.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import org.example.finde_project.presentation.screen.HomeScreen

@Composable
fun MainNavigation(
    navController: NavHostController,
) {

    NavHost(
        navController = navController,
        startDestination = AppNavigation.HOME_SCREEN
    ) {
        composable(
            route = AppNavigation.HOME_SCREEN
        ) {
            HomeScreen(navController = navController)
        }
    }
}