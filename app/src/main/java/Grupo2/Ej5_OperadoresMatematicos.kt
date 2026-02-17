/*
*   ALUMNO: Tomy Jose Montufar Zuniga
*   CUENTA: 202310050054
*   ASIGNATURA: Programacion Movil I
*   FECHA: 16/02/2026
* */
package Grupo2

class Operaciones {
    fun suma(a:Int, b:Int):Int {
        return a+b
    }

    fun resta(a:Int, b:Int):Int {
        return a-b
    }

    fun multiplicacion(a:Int, b:Int):Int {
        return a*b
    }

    fun division(a:Int, b:Int):Int {
        return a/b
    }

    fun multiple(a:Int, b:Int, c:Int):Int {
        return a+b*c
    }

    fun multiple2(a:Int, b:Int, c:Int):Int {
        return a-b/c
    }
}

fun main() {
    val op = Operaciones()

    println("Suma: ${op.suma(2,2)}")
    println("Resta: ${op.resta(3,1)}")
    println("Multiplicacion: ${op.multiplicacion(2,3)}")
    println("Division: ${op.division(10,5)}")
    println("Multiple 1: ${op.multiple(2,3,2)}")
    println("Multiple 2: ${op.multiple2(4,2,2)}")
}