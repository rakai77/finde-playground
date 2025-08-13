package org.example.finde_project.presentation.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import finder_project.composeapp.generated.resources.Res
import finder_project.composeapp.generated.resources.nunito_bold
import finder_project.composeapp.generated.resources.nunito_extra_bold
import finder_project.composeapp.generated.resources.nunito_extra_light
import finder_project.composeapp.generated.resources.nunito_light
import finder_project.composeapp.generated.resources.nunito_medium
import finder_project.composeapp.generated.resources.nunito_regular
import finder_project.composeapp.generated.resources.nunito_semi_bold
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.InternalResourceApi

@OptIn(InternalResourceApi::class)
@Composable
fun findeFontFamily()  = FontFamily(
    Font(Res.font.nunito_light, FontWeight.Light),
    Font(Res.font.nunito_extra_light, FontWeight.ExtraLight),
    Font(Res.font.nunito_regular, FontWeight.Normal),
    Font(Res.font.nunito_medium, FontWeight.Medium),
    Font(Res.font.nunito_bold, FontWeight.Bold),
    Font(Res.font.nunito_semi_bold, FontWeight.SemiBold),
    Font(Res.font.nunito_extra_bold, FontWeight.ExtraBold),
)
@Composable
fun findeFontSize() = object {
    private val nunito = findeFontFamily()
    val headlineExtraLarge = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.Bold,
        fontSize = 56.sp,
        lineHeight = 78.sp
    )
    val headlineLarge = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.Bold,
        fontSize = 40.sp,
        lineHeight = 44.sp
    )
    val headlineMediumBold = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        lineHeight = 38.sp
    )
    val headlineMedium = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.Bold,
        fontSize = 40.sp,
        lineHeight = 44.sp
    )
    val headlineSmall = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.Normal,
        fontSize = 26.sp,
        lineHeight = 32.sp
    )
    val titleLargeBold = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.Bold,
        fontSize = 23.sp,
        lineHeight = 36.sp
    )
    val titleLarge = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
        lineHeight = 36.sp
    )
    val titleMediumBold = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        lineHeight = 26.sp
    )
    val titleMedium = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
        lineHeight = 26.sp
    )
    val titleSmallBold = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        lineHeight = 24.sp
    )
    val titleSmall = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 24.sp
    )
    val bodyLargeBold = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        lineHeight = 22.sp
    )
    val bodyLarge = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 22.sp
    )
    val bodyMediumBold = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        lineHeight = 20.sp
    )
    val bodyMedium = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 20.sp
    )
    val bodySmallBold = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
        lineHeight = 18.sp
    )
    val bodySmall = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp,
        lineHeight = 18.sp
    )
    val labelLarge = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp,
        lineHeight = 18.sp
    )
    val labelLargeBold = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
        lineHeight = 18.sp
    )
    val labelMedium = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.SemiBold,
        fontSize = 10.sp,
        lineHeight = 16.sp
    )
    val labelSmall = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.SemiBold,
        fontSize = 8.sp,
        lineHeight = 14.sp
    )
    val labelTextField = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp,
        lineHeight = 18.sp
    )
    val placeholderTextField = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 24.sp
    )
    val placeholderTextFieldTransactionEmas = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
        lineHeight = 26.sp
    )
    val valueTextField = TextStyle(
        color = FindeColor.FocusTextField,
        fontFamily = nunito,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 24.sp
    )
    val errorTextField = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 14.sp
    )
    val buttonText = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        lineHeight = 24.sp
    )
    val label12NormalNoLineHeight = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
    )
    val label12SemiBoldNoLineHeight = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp,
    )
    val label12SemiBold = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp,
        lineHeight = 18.sp,
    )
    val label24Bold = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 36.sp
    )
    val label20Bold = TextStyle(
        fontFamily = nunito,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        lineHeight = 36.sp
    )
}
