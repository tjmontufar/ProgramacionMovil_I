/*
*   ALUMNO: Tomy Jose Montufar Zuniga
*   CUENTA: 202310050054
*   ASIGNATURA: Programacion Movil I
*   FECHA: 16/02/2026
* */
package Grupo4

lateinit var nombre: String

val mensaje: String by lazy {
    // Mensaje en consola que solo se mostrara una vez despues de su uso durante la ejecucion
    println("Espere un momento...")
    "Hola, Tomy!"
}

fun main() {
    nombre = "Iliana"
    println("El nombre es: " + nombre)

    println("Antes del mensaje")
    println(mensaje)

    println("\nDespues del mensaje")
    println(mensaje)
}