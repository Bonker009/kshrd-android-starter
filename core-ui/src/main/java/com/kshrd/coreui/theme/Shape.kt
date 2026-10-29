package com.kshrd.coreui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

/**
 * Material 3 shape scale.
 * - extraSmall 4dp: text fields
 * - small 8dp: chips
 * - medium 12dp: list tiles
 * - large 16dp: cards
 * - extraLarge 28dp: bottom sheets, dialogs
 */
val AppShapes =
    Shapes(
        extraSmall = RoundedCornerShape(4.dp),
        small = RoundedCornerShape(8.dp),
        medium = RoundedCornerShape(12.dp),
        large = RoundedCornerShape(16.dp),
        extraLarge = RoundedCornerShape(28.dp),
    )

/** Fully rounded ends for buttons and segmented controls. */
val PillShape = RoundedCornerShape(percent = 50)
