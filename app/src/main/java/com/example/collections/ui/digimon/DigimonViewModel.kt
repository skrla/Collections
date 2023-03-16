package com.example.collections.ui.digimon

import androidx.lifecycle.ViewModel
import com.example.collections.repository.DigimonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DigimonViewModel @Inject constructor(private val repository: DigimonRepository) : ViewModel()  {

}