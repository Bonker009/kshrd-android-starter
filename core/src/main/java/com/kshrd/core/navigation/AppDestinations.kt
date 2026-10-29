package com.kshrd.core.navigation

import kotlinx.serialization.Serializable

/**
 * Type-safe navigation destinations. Every screen in the app is one of these.
 *
 * Destinations live in `:core` so any feature can navigate to any screen without depending on the
 * feature module that implements it. The graph that maps a destination to a composable lives in
 * `:app` (`MainGraph.kt`).
 *
 * - A screen without arguments is a `data object`.
 * - A screen with arguments is a `data class`; the ViewModel reads them with
 *   `savedStateHandle.toRoute<NoteDetail>()`.
 */
sealed interface AppDestination

@Serializable
data object NoteList : AppDestination

@Serializable
data class NoteDetail(val noteId: Long) : AppDestination
