package com.ramirez.diferido.repository

import com.ramirez.diferido.data.provincia

class provinciaRepository (private val provincias:MutableList<provincia>){

    fun getProvincia ()= provincias

        fun addProvincia (provincia: provincia) = provincias.add(provincia)
}

