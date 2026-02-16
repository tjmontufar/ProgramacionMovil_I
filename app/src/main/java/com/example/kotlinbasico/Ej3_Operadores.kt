package com.example.kotlinbasico

fun main() {

    println("Operador Elvis")

    var version: Int?= 3
    println("La version actual de Android es: $version")
    version = null
    println("La version actual de Android es: $version")
    println("La version actual de Android es: ${version?:-1}")

    println("Operadores Aritmeticos")
    print("Ingrese el primer numero: ")
    var num1 = readln().toInt()
    print("Ingrese el segundo numero: ")
    var num2 = readln().toInt()
    println("La suma es: ${num1+num2}")

    println("Operadores de incremento")
    var x:Int = 10
    var xMas = --x
    var xMenos = x--
    println(xMas)
    println(xMenos)

    println("Operadores de igualdad")
    var esIgual:Boolean = (3==3)
    println(esIgual)

    var noEsIgual:Boolean = (3!=2)
    println(noEsIgual)

    println("Operadores logicos")
    val valorO = (1==1 || 1==5)
    println("OR: $valorO")

    val valorY = (1==1 && 1==5)
    println("AND: $valorY")

    val valorMenorIgualque = (1 <= 2)
    println("MENOR IGUAL QUE: $valorMenorIgualque")

    val valorMayorIgualque = (2 >= 1)
    println("MAYOR IGUAL QUE: $valorMayorIgualque")

    val valorMenorque = (1 < 2)
    println("MENOR QUE: $valorMenorque")

    val valorMayorque = (2 > 1)
    println("MAYOR QUE: $valorMayorque")

}