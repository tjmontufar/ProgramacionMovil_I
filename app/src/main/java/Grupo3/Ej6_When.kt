/*
*   ALUMNO: Tomy Jose Montufar Zuniga
*   CUENTA: 202310050054
*   ASIGNATURA: Programacion Movil I
*   FECHA: 16/02/2026
* */
package Grupo3

class DiaSemana {
    fun obtenerDia(numero:Int):String {
        return when (numero) {
            1 -> "Lunes"
            2 -> "Martes"
            3 -> "Miercoles"
            4 -> "Jueves"
            5 -> "Viernes"
            6 -> "Sabado"
            7 -> "Domingo"
            else -> "Numero no valido"
        }
    }
}

fun main() {
    val dia = DiaSemana()

    print("Ingrese un numero del 1 al 7 para determinar el dia de la semana: ")
    val numero = readLine()!!.toInt()
    val resultado = dia.obtenerDia(numero)
    println("Hoy es: ${resultado}")
}