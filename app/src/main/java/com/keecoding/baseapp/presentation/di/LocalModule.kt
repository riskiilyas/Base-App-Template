package com.keecoding.baseapp.presentation.di

import android.app.Application
import com.keecoding.baseapp.data.local.SharedPref
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalModule {

    @Provides
    @Singleton
    fun provideSharedPref(context: Application): SharedPref {
        return SharedPref(context)
    }

}