package com.example.kotlinbasico

// Funcion Main

fun main() {
    println("Hola Iliana.")
    var lenguaje = "kotlin"
    val plataforma = "Android"

    println("Estoy programando en $lenguaje en mi $plataforma")

    // var se utiliza cuando se esperan cambios en el valor
    var edad = "20 años"
    edad = "21 años"

    // val se utiliza cuando no se esperan cambios en el valor
    val nombre = "Tomy"
    // nombre = "Liceth Zuniga"

    println("Hola, mi nombre es $nombre y tengo $edad.")
}