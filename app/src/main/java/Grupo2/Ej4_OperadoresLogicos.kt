/*
*   ALUMNO: Tomy Jose Montufar Zuniga
*   CUENTA: 202310050054
*   ASIGNATURA: Programacion Movil I
*   FECHA: 16/02/2026
* */
package Grupo2

class Rango {
    fun estaEnRango(numero:Int):Boolean {
        return numero > 10 && numero < 20
    }

    fun FueraDeRango(numero:Int):Boolean {
        return numero < 10 || numero > 20
    }

    fun noEstaEnRango(numero:Int):Boolean {
        return !(numero > 10 && numero < 20)
    }
}

fun main() {
    val verificador = Rango()

    println("Operador AND")
    println("Esta en rango (10-20)? : ${verificador.estaEnRango(15)}")
    println("Operador OR")
    println("Es menor o mayor que 20?: ${verificador.FueraDeRango(25)}")
    println("Operador NOT")
    println("No esta en el rango?: ${verificador.noEstaEnRango(15)}")

}