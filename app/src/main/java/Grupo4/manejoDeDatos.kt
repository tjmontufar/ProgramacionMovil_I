/*
*   ALUMNO: Tomy Jose Montufar Zuniga
*   CUENTA: 202310050054
*   ASIGNATURA: Programacion Movil I
*   FECHA: 16/02/2026
* */
package Grupo4

class manejoDeDatos {
    fun filtrarEdades(edades: List<Int>): List<Int> {
        return edades.filter { it > 30 }
    }

    fun cantidadEdades(edades: List<Int>): Int {
        return edades.count { it > 30}
    }

    fun orderarNombres(nombres: List<String>): List<String> {
        return nombres.sorted()
    }

    fun orderarEdadesDescendente(edades: List<Int>): List<Int> {
        return edades.sortedDescending()
    }
}