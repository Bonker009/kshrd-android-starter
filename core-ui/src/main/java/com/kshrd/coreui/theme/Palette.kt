@file:Suppress("MagicNumber") // Palette file: hex colour literals are the tokens themselves.

package com.kshrd.coreui.theme

import androidx.compose.ui.graphics.Color

/**
 * Raw palette (KSHRD design system). Screens never read these directly: use
 * `MaterialTheme.colorScheme` so light and dark mode stay correct. Raw values live here so
 * both colour schemes are built from the same tokens.
 */
internal object Palette {
    val Brand = Color(0xFF00518D)
    val Navy = Color(0xFF003A66)
    val Tint = Color(0xFFE6EEF5)
    val Ink = Color(0xFF1E293B)
    val Muted = Color(0xFF64748B)
    val Outline = Color(0xFFCBD5E1)
    val Line = Color(0xFFE2E8F0)
    val Divider = Color(0xFFF1F5F9)
    val Ground = Color(0xFFF8FAFC)
    val White = Color(0xFFFFFFFF)

    val Success = Color(0xFF0F766E)
    val Danger = Color(0xFFDC2626)
    val DangerStrong = Color(0xFFB91C1C)
    val DangerContainer = Color(0xFFFEE2E2)

    // Dark-theme counterparts.
    val DarkBackground = Color(0xFF0F172A)
    val DarkSurface = Color(0xFF111827)
    val DarkSurfaceHigh = Color(0xFF1E293B)
    val DarkLine = Color(0xFF1F2937)
    val DarkOutline = Color(0xFF334155)
    val DarkInk = Color(0xFFE2E8F0)
    val DarkMuted = Color(0xFF94A3B8)
    val DarkBrand = Color(0xFF7CB2E3)
    val DarkBrandContainer = Color(0xFF1E3A5F)
    val DarkSuccess = Color(0xFF2DD4BF)
    val DarkDanger = Color(0xFFF87171)
}
