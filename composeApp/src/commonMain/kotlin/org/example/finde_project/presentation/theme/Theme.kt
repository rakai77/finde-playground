package org.example.finde_project.presentation.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = FindeColor.Primary,
    secondary = FindeColor.Secondary,
    tertiary = FindeColor.Tertiary,
    background = FindeColor.JetBlack.Minus90,
    surface = FindeColor.White,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
)

@Composable
fun FindeTheme(
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        shapes = Shapes,
        content = content
    )
}

val Shapes = Shapes(
    extraLarge = RoundedCornerShape(Dimens.dp32),
    large = RoundedCornerShape(Dimens.dp24),
    medium = RoundedCornerShape(Dimens.dp16),
    small = RoundedCornerShape(Dimens.dp8),
    extraSmall = RoundedCornerShape(Dimens.dp4)
)

