/*
*   ALUMNO: Tomy Jose Montufar Zuniga
*   CUENTA: 202310050054
*   ASIGNATURA: Programacion Movil I
*   FECHA: 16/02/2026
* */
package Grupo2

fun main() {
    val comparaciones = Comparaciones()
    print("Ingrese el valor de A: ")
    val a = readln().toInt()
    print("Ingrese el valor de B: ")
    val b = readln().toInt()

    println("Es igual? : ${comparaciones.esIgual(a,b)}")
    println("Es diferente? : ${comparaciones.esDiferente(a,b)}")
    println("Es mayor A que B? : ${comparaciones.esMayor(a,b)}")
    println("Es menor A que B? : ${comparaciones.esMenor(a,b)}")
    println("Es A mayor o igual que B? : ${comparaciones.esMayorIgual(a,b)}")
    println("Es A menor o igual que B? : ${comparaciones.esMenorIgual(a,b)}")
}

class Comparaciones {
    fun esIgual(a:Int, b:Int):Boolean {
        return a==b
    }

    fun esDiferente(a:Int, b:Int):Boolean {
        return a!=b
    }

    fun esMayor(a:Int, b:Int):Boolean {
        return a>b
    }

    fun esMenor(a:Int, b:Int):Boolean {
        return a<b
    }

    fun esMayorIgual(a:Int, b:Int):Boolean {
        return a>=b
    }

    fun esMenorIgual(a:Int, b:Int):Boolean {
        return a<=b
    }
}