package org.example.finde_project.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import org.example.finde_project.presentation.navigation.MainNavigation
import org.example.finde_project.presentation.theme.FindeTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun MainScreen() {

    val navController = rememberNavController()

    FindeTheme {
        MainNavigation(navController = navController)
    }
}