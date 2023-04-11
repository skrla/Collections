package com.example.collections.di

import android.app.Application
import androidx.room.Room
import com.example.collections.data.local.TCGDao
import com.example.collections.data.local.TCGDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(app: Application): TCGDatabase {
        return Room.databaseBuilder(
            app,
            TCGDatabase::class.java,
            "tcg_data"
            )
            .build()

    }

    @Provides
    @Singleton
    fun provideDao(tcgDatabase: TCGDatabase): TCGDao {
        return tcgDatabase.tcgDao
    }
}