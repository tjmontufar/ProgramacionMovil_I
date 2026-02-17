/*
*   ALUMNO: Tomy Jose Montufar Zuniga
*   CUENTA: 202310050054
*   ASIGNATURA: Programacion Movil I
*   FECHA: 16/02/2026
* */
package Grupo4

fun main() {
    val frutas = mutableListOf("Manzana","Pera","Banana","Naranja","Uva")

    print("\nLista inicial de frutas: " + frutas)
    frutas.add("Kiwi")
    frutas.remove("Banana")
    frutas[0] = "Mango"
    frutas.add("Fresa")
    println("\nLista modificada de frutas: " + frutas)
}