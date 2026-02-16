package com.example.kotlinbasico

fun main() {
    // Variables booleanas
    val soyPatepluma = true

    println("Soy Patepluma? $soyPatepluma")

    println("Numeros Enteros")
    var entero: Int = 120
    println("Valor del numero entero: $entero")

    val milisegundos: Long = 21_474_836_471L // Los guiones bajos son los separadores del numero largo y debe finalizar con L
    println("Valor de la variable en milisegundos: $milisegundos")

    println("Numeros Decimales")
    val pi: Float = 3.1416F // Las variables flotantes terminan con F
    println("Valor de la variable PI: $pi")

    println("Cadena de caracteres")
    val nombre: String = "Tomy"
    println("Valor de la variable nombre: $nombre")
    val casosEspeciales: String = "Hola, soy \"n\" Tomy" // El slash acompañado del caracter especial anula su efecto y lo incluye en la consola
    println(casosEspeciales)

    println("Concatenacion")
    print("Ingresa tu nombre: ")
    val nombrecompleto = readln() // Leer el dato ingresado (input)
    println("Hola $nombrecompleto")
    println("Hola " + nombrecompleto)

    println("Nulabilidad")
    var sobreNombre: String ?= null
    sobreNombre = "CUCHURRUMI"
    println("La longitud de la variable sobrenombre es: ${sobreNombre!!.length}") // El !! indica que estoy seguro que esa variable NO es null
    sobreNombre = null
    println("La longitud de la variable sobrenombre es: ${sobreNombre?.length}")
}