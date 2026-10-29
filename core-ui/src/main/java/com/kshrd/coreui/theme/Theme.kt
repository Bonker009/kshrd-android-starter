package com.kshrd.coreui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme =
    lightColorScheme(
        primary = Palette.Brand,
        onPrimary = Palette.White,
        primaryContainer = Palette.Tint,
        onPrimaryContainer = Palette.Navy,
        secondary = Palette.Navy,
        onSecondary = Palette.White,
        secondaryContainer = Palette.Tint,
        onSecondaryContainer = Palette.Navy,
        tertiary = Palette.Success,
        onTertiary = Palette.White,
        background = Palette.White,
        onBackground = Palette.Ink,
        surface = Palette.White,
        onSurface = Palette.Ink,
        surfaceVariant = Palette.Divider,
        onSurfaceVariant = Palette.Muted,
        surfaceContainerLowest = Palette.White,
        surfaceContainerLow = Palette.Ground,
        surfaceContainer = Palette.Divider,
        surfaceContainerHigh = Palette.Line,
        surfaceContainerHighest = Palette.Line,
        outline = Palette.Outline,
        outlineVariant = Palette.Line,
        error = Palette.Danger,
        onError = Palette.White,
        errorContainer = Palette.DangerContainer,
        onErrorContainer = Palette.DangerStrong,
        inverseSurface = Palette.Ink,
        inverseOnSurface = Palette.White,
        inversePrimary = Palette.DarkBrand,
    )

private val DarkColorScheme =
    darkColorScheme(
        primary = Palette.DarkBrand,
        onPrimary = Palette.DarkSurface,
        primaryContainer = Palette.DarkBrandContainer,
        onPrimaryContainer = Palette.DarkInk,
        secondary = Palette.DarkBrand,
        onSecondary = Palette.DarkSurface,
        secondaryContainer = Palette.DarkBrandContainer,
        onSecondaryContainer = Palette.DarkInk,
        tertiary = Palette.DarkSuccess,
        onTertiary = Palette.DarkSurface,
        background = Palette.DarkSurface,
        onBackground = Palette.DarkInk,
        surface = Palette.DarkSurface,
        onSurface = Palette.DarkInk,
        surfaceVariant = Palette.DarkLine,
        onSurfaceVariant = Palette.DarkMuted,
        surfaceContainerLowest = Palette.DarkBackground,
        surfaceContainerLow = Palette.DarkBackground,
        surfaceContainer = Palette.DarkLine,
        surfaceContainerHigh = Palette.DarkSurfaceHigh,
        surfaceContainerHighest = Palette.DarkOutline,
        outline = Palette.DarkOutline,
        outlineVariant = Palette.DarkLine,
        error = Palette.DarkDanger,
        onError = Palette.DarkSurface,
        errorContainer = Palette.DarkDanger.copy(alpha = 0.16f),
        onErrorContainer = Palette.DarkDanger,
        inverseSurface = Palette.DarkInk,
        inverseOnSurface = Palette.DarkSurface,
        inversePrimary = Palette.Brand,
    )

/**
 * The app theme. Wrap the whole UI in it once (in `MainActivity`) and every preview in it
 * (through `PreviewSurface`). Screens read colours from `MaterialTheme.colorScheme`,
 * text styles from `MaterialTheme.typography`, and corners from `MaterialTheme.shapes`.
 */
@Composable
fun AppTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = if (isDarkTheme) DarkColorScheme else LightColorScheme,
        typography = AppTypography,
        shapes = AppShapes,
        content = content,
    )
}
