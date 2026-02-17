/*
*   ALUMNO: Tomy Jose Montufar Zuniga
*   CUENTA: 202310050054
*   ASIGNATURA: Programacion Movil I
*   FECHA: 16/02/2026
* */
package Grupo4

fun main() {
    val edades = mutableMapOf(
        "Iliana" to 25,
        "Tomy" to 30,
        "Ana" to 28
    )

    println(edades)
    edades["Iliana"] = 20
    println("Edad nueva de Iliana: " + edades["Iliana"])
    println("Edad vieja de Tomy: " + edades["Tomy"])

    edades["Josue"] = 19
    println(edades)
    edades.remove("Tomy")
    println(edades)
}