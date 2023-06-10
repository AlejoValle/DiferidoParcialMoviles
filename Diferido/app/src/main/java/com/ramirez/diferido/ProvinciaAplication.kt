package com.ramirez.diferido

import android.app.Application
import com.ramirez.diferido.data.provincias
import com.ramirez.diferido.repository.ProvinciaRepository

class ProvinciaAplication: Application(){

    val provinciaRepository:ProvinciaRepository by lazy {
        ProvinciaRepository(provincias)
    }


}