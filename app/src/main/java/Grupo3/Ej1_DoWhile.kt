/*
*   ALUMNO: Tomy Jose Montufar Zuniga
*   CUENTA: 202310050054
*   ASIGNATURA: Programacion Movil I
*   FECHA: 16/02/2026
* */
package Grupo3

class Menu {
    fun mostrarMenu() {
        var opcion: Int

        do {
            println("------ MENU ------")
            println("1. Saludar")
            println("2. Salir")
            print("Seleccione una opcion: ")
            opcion = readLine()!!.toInt()

            when(opcion) {
                1 -> println("Hola usuario.")
                2 -> println("Saliendo del programa...")
                else ->println("Opcion no valida. Intente de nuevo.")
            }
        } while (opcion != 2)
    }
}

fun main() {
    val menu = Menu()
    menu.mostrarMenu()
}