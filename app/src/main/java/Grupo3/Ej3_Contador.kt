/*
*   ALUMNO: Tomy Jose Montufar Zuniga
*   CUENTA: 202310050054
*   ASIGNATURA: Programacion Movil I
*   FECHA: 16/02/2026
* */
package Grupo3

class Contador {
    fun contar(numero:Int) {
        for(i in 1..numero) {
            println("Numero : $i")
        }
    }
}

fun main() {
    val contador = Contador()
    print("Ingrese un numero: ")
    val numero = readLine()!!.toInt()
    contador.contar(numero)
}