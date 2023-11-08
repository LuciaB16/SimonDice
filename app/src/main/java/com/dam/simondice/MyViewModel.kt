package com.dam.simondice

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MyViewModel() : ViewModel() {

    private val TAG_LOG: String = "mensaje ViewModel"

    init {
        Log.d(TAG_LOG, "Inicializamos ViewModel")
    }


    var counter = mutableStateOf(0)
    var name = mutableStateOf("")

    /**
     * Función de contador que aumenta en 1 el valor de la variable counter cada vez que se llama
     */
    fun contador() {
        counter.value++
    }

    /**
     * Función que devuelve el valor de counter
     */
    fun getContador(): Int {
        return counter.value
    }

    /**
     * Función que devuelve el valor de name
     */
    fun getString(): String {
        return name.value
    }

}