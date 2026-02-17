/*
*   ALUMNO: Tomy Jose Montufar Zuniga
*   CUENTA: 202310050054
*   ASIGNATURA: Programacion Movil I
*   FECHA: 16/02/2026
* */
package Grupo4

fun main() {
    // MAPS
    println("----- MAPS -----")
    val numeros = listOf(1,2,3,4)
    val cuadrados = numeros.map { it*it }
    println("Numeros: "+numeros)
    println("Cuadrados: "+cuadrados)

    // ZIPS
    println("----- ZIPS -----")
    val nombres = listOf("Maria","Iliana","Marielos")
    val edades = listOf(25,20,26)
    val nombres_edades = nombres.zip(edades)

    println(nombres)
    println(edades)
    println(nombres_edades)

    // FLATTEN
    println("----- FLATTEN -----")
    val listas = listOf(
        listOf(1,2),
        listOf(3,4),
        listOf(5)
    )

    val todojunto = listas.flatten()
    println(listas)
    println(listas[0])
    println(listas[1])
    println(listas[2])
    println(todojunto)
}