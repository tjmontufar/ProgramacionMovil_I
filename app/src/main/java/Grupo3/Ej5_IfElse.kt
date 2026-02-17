/*
*   ALUMNO: Tomy Jose Montufar Zuniga
*   CUENTA: 202310050054
*   ASIGNATURA: Programacion Movil I
*   FECHA: 16/02/2026
* */
package Grupo3

class mayorEdad {
    fun verificarEdad(edad:Int): String {
        if (edad>=18) {
            return "Eres mayor de edad."
        } else {
            return "Eres menor de edad"
        }
    }
}

fun main() {
    val persona = mayorEdad()
    print("Ingrese su edad actual: ")
    val edad = readLine()!!.toInt()
    val resultado = persona.verificarEdad(edad)
    println(resultado)
}