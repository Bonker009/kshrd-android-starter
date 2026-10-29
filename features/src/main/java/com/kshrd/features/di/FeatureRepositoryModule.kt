package com.kshrd.features.di

import com.kshrd.features.note.data.repository.NoteRepositoryImpl
import com.kshrd.features.note.domain.repository.NoteRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Interface-to-implementation bindings for repositories.
 * Use cases are not listed here: a class with `@Inject constructor` is injectable as is.
 */
@Module
@InstallIn(SingletonComponent::class)
abstract class FeatureRepositoryModule {
    @Binds
    @Singleton
    abstract fun bindNoteRepository(impl: NoteRepositoryImpl): NoteRepository
}
