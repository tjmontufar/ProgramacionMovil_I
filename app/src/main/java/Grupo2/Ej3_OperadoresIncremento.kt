/*
*   ALUMNO: Tomy Jose Montufar Zuniga
*   CUENTA: 202310050054
*   ASIGNATURA: Programacion Movil I
*   FECHA: 16/02/2026
* */
package Grupo2

class Contador {
    var numero:Int = 8

    fun incrementar() {
        numero++
    }
}

fun main() {
    val cont = Contador()
    println("Valor inicial: ${cont.numero}")
    cont.incrementar()
    println("Valor final: ${cont.numero}")
}