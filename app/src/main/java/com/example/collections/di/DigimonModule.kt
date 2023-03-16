package com.example.collections.di

import com.example.collections.data.remote.DigimonApi
import com.example.collections.repository.DigimonRepository
import com.example.collections.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@Module
@InstallIn(ViewModelComponent::class)
object DigimonModule {

    @Provides
    fun provideDigimonRepository(api: DigimonApi) = DigimonRepository(api)

    @Provides
    fun provideApiService(): DigimonApi {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(Constants.DIGIMON_URL)
            .build()
            .create(DigimonApi::class.java)
    }
}