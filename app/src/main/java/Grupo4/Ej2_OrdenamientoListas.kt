/*
*   ALUMNO: Tomy Jose Montufar Zuniga
*   CUENTA: 202310050054
*   ASIGNATURA: Programacion Movil I
*   FECHA: 16/02/2026
* */
package Grupo4

fun main() {
    val manejador = manejoDeDatos()

    val edades = listOf(25,30,28,22,35,40,18,32)
    val nombres = listOf("Mario","Iliana","Lucas","Diana","Tomy","Josue")

    println("Edades mayores a 30: " + manejador.filtrarEdades(edades))
    println("Cantidad de edades mayores a 30: " + manejador.cantidadEdades(edades))

    println("\nNombres ordenados: " + manejador.orderarNombres(nombres))
    println("Edades ordenadas de manera descendente: " + manejador.orderarEdadesDescendente(edades))
}