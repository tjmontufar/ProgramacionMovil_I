/*
*   ALUMNO: Tomy Jose Montufar Zuniga
*   CUENTA: 202310050054
*   ASIGNATURA: Programacion Movil I
*   FECHA: 16/02/2026
* */
package Grupo1

class Persona(val nombre:String, val edad:Int) {
    val mensaje = "Hola, mi nombre es " + nombre + " y tengo $edad anios."
}

fun main() {
    val persona = Persona("Tomy",20)

    println(persona.mensaje)
}