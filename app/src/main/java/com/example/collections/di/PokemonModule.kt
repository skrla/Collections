package com.example.collections.di

import com.example.collections.data.local.TCGDao
import com.example.collections.data.remote.PokemonApi
import com.example.collections.repository.PokemonRepository
import com.example.collections.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@Module
@InstallIn(ViewModelComponent::class)
object PokemonModule {

    @Provides
    fun providePokemonRepository(api: PokemonApi, tcgDao: TCGDao): PokemonRepository {
        return PokemonRepository(api, tcgDao)
    }

    @Provides
    fun provideApiService(): PokemonApi {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(Constants.POKEMON_TCG_URL)
            .build()
            .create(PokemonApi::class.java)
    }
}