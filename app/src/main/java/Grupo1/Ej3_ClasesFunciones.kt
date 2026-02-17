/*
*   ALUMNO: Tomy Jose Montufar Zuniga
*   CUENTA: 202310050054
*   ASIGNATURA: Programacion Movil I
*   FECHA: 16/02/2026
* */
package Grupo1

class Rectangulo(val base: Double, val altura: Double) {

    fun calcularArea(): Double {
        return base * altura
    }
}

fun main() {
    val rect = Rectangulo(5.0, 3.0)
    println("El área es: ${rect.calcularArea()}")
}