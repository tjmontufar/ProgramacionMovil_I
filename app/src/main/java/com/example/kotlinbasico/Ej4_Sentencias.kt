package com.example.kotlinbasico

import android.net.EthernetNetworkSpecifier

fun main() {
    println("Sentencias o condicionales")

    print("a: ")
    val a = readln().toInt()
    print("b: ")
    val b = readln().toInt()

    println("Sentencia if")
    if (false)
        println("La sentencia se cumplio.")
    else
        println("La sentencia NO se cumplio.")

    println("Sentencia if else")
    var comparacion = (a<b)

    if (comparacion)
        println("A es menor que B")
    else
        println("A es mayor que B")

    if ((a<b))
        println("A es menor que B")
    else
        println("A es mayor que B")

    println("Sentencia if else if")
    if(comparacion)
        println(comparacion)
    else if (a==b)
        println("No use la var comparacion.")
    else
        println(comparacion)

    println("Sentencia When")
    println("Ingresa tu nombre para ver tu salario: ")
    val nombre = readln()
    when(nombre) {
        "Iliana" -> println("Tu salario es de 1.00")
        "Anderson" -> println("Tu salario es de 10,000.00")
        "Marielos" -> println("Tu salario es de 5,000.00")
        "Tomy" -> {
            println("Tu salario base es de 1,000,000.00")
            println("Tu bonificacion es de 100,000.00")
            println("Tu salario total es de 1,100,000.00")
        }
        else -> println("No encontramos tu nombre, vaya busque chamba.")
    }


}