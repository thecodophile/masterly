package com.somnath.masterly.presentation.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = LightPrimary,
    secondary = LightSecondary,
    background = LightBackground,
    surface = LightCard,
    error = LightDestructive,
    onPrimary = LightPrimaryForeground,
    onSecondary = LightSecondaryForeground,
    onBackground = LightForeground,
    onSurface = LightCardForeground,
    onError = LightDestructiveForeground,
)

private val LightColorScheme = lightColorScheme(
    primary = DarkPrimary,
    secondary = DarkSecondary,
    background = DarkBackground,
    surface = DarkCard,
    error = DarkDestructive,
    onPrimary = DarkPrimaryForeground,
    onSecondary = DarkSecondaryForeground,
    onBackground = DarkForeground,
    onSurface = DarkCardForeground,
    onError = DarkDestructiveForeground,
)

@Composable
fun MasterlyTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
      dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
        val context = LocalContext.current
        if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
      }
      darkTheme -> DarkColorScheme
      else -> LightColorScheme
    }

    MaterialTheme(
      colorScheme = colorScheme,
      typography = masterlyTypography(),
      content = content
    )
}