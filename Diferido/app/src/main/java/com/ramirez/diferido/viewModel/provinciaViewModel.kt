package com.ramirez.diferido.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.ramirez.diferido.ProvinciaAplication
import com.ramirez.diferido.data.provincia
import com.ramirez.diferido.repository.ProvinciaRepository

class provinciaViewModel (private val ProvinciaRepository: ProvinciaRepository) : ViewModel(){

    val name = MutableLiveData ("")
    val capital = MutableLiveData ("")
    val state = MutableLiveData ("")

    fun getProvincia()=ProvinciaRepository.getProvincias()
    fun addProvincia(Provincia:provincia) = ProvinciaRepository.addProvincias(Provincia)

    companion object{
        val Factory = viewModelFactory {
            initializer {
                val viewProvincias = (this[APPLICATION_KEY] as ProvinciaAplication).provinciaRepository
                provinciaViewModel(viewProvincias)
            }
        }

        const val PROVINCIA_CREATED = "provincia creada"
        const val WRONG_INFORMATION = "Wrong information"
        const val INACTIVE = ""

    }
    fun validateData():Boolean{
        when {
            name.value.isNullOrEmpty()->return false
            capital.value.isNullOrEmpty()->return false
        }
        return true
    }
    fun createProvincia(){
        if(!validateData()){
            state.value = WRONG_INFORMATION
            return
        }

        val Provincia = provincia(
            name.value!!,
            capital.value!!
        )

        addProvincia(Provincia)
        clearData()
        state.value = PROVINCIA_CREATED
    }

    fun clearData(){
        name.value = ""
        capital.value = ""
    }
    fun clearstate(){
        state.value = INACTIVE
    }
    fun selectprovincia (Provincia:provincia){
        name.value = Provincia.name
        capital.value = Provincia.capital

    }
}