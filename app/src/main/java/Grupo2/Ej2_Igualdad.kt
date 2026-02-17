/*
*   ALUMNO: Tomy Jose Montufar Zuniga
*   CUENTA: 202310050054
*   ASIGNATURA: Programacion Movil I
*   FECHA: 16/02/2026
* */
package Grupo2

fun main() {
    val secreto = NumeroSecreto()
    print("Ingrese su numero: ")
    val num = readln().toInt()
    println("El numero que usted ingreso fue: ${num}")
    println("Es el numero correto? : ${secreto.verificarNumero(num)}")
}

class NumeroSecreto {
    private val numeroSecreto = 7

    fun verificarNumero(numero:Int):Boolean {
        return numero == numeroSecreto
    }
}