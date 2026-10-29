package com.kshrd.starter.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.kshrd.core.navigation.NoteDetail
import com.kshrd.core.navigation.NoteList
import com.kshrd.core.navigation.navigateTo
import com.kshrd.coreui.motion.AppMotion
import com.kshrd.features.note.presentation.screen.NoteDetailScreen
import com.kshrd.features.note.presentation.screen.NoteListScreen

/**
 * Maps every typed destination in `:core` to the screen that renders it.
 * Feature screens receive navigation as callbacks; only this file knows the graph.
 */
@Composable
fun MainGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NoteList,
        enterTransition = { AppMotion.forwardEnter() },
        exitTransition = { AppMotion.forwardExit() },
        popEnterTransition = { AppMotion.backEnter() },
        popExitTransition = { AppMotion.backExit() },
    ) {
        composable<NoteList> {
            NoteListScreen(onOpenNote = { id -> navController.navigateTo(NoteDetail(noteId = id)) })
        }
        composable<NoteDetail> {
            NoteDetailScreen(onBack = { navController.popBackStack() })
        }
    }
}
