package com.ramirez.diferido.repository

import com.ramirez.diferido.data.provincia

class ProvinciaRepository (private val provincias:MutableList<provincia>){

    fun getProvincias()= provincias

        fun addProvincias(Provincia: provincia) = provincias.add(Provincia)

}

