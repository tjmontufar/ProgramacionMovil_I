package com.example.kotlinbasico

fun main() {
    println("Ciclos o Bucles")
    println("For:")
    for (i in 1..5)
        println(i)

    val nombre = "Tomy"
    for (i in 0..nombre.length-1)
        print(nombre[i])

    for (letra in nombre)
        print(letra)
    nombre.forEach { letra->print(letra) }
    nombre.forEach { print(it) }

    println("")

    println("While y Do While:")
    var indice = 0
    while (indice < nombre.length) {
        println("Indice: $indice = ${nombre[indice]}")
        indice++
    }

    indice = nombre.length
    do {
        indice++
        println("Indice: $indice = ${nombre[indice-(nombre.length-1)]}")
    } while (indice>0)
}