/*
*   ALUMNO: Tomy Jose Montufar Zuniga
*   CUENTA: 202310050054
*   ASIGNATURA: Programacion Movil I
*   FECHA: 16/02/2026
* */
package Grupo3

class Evaluador {
    fun evaluarNumero(numero:Int):String {
        if (numero >= 0) {
            return "El numero es positivo."
        }

        return "El numero es negativo."
    }
}

fun main() {
    val evaluador = Evaluador()
    print("Ingrese un numero: ")
    val numero = readLine()!!.toInt()
    val resultado = evaluador.evaluarNumero(numero)
    println(resultado)
}