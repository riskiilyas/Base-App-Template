package com.keecoding.baseapp.presentation.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

    // UNCOMMENT WHEN DB IS AVAILABLE

//    @Singleton
//    @Provides
//    fun provideNewsDatabase(app: Application): AppDatabase {
//        return Room.databaseBuilder(app, AppDatabase::class.java, AppDatabase.TAG)
//            .fallbackToDestructiveMigration()
//            .build()
//    }

}