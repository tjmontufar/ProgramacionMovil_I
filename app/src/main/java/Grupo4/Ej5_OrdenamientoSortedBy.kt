/*
*   ALUMNO: Tomy Jose Montufar Zuniga
*   CUENTA: 202310050054
*   ASIGNATURA: Programacion Movil I
*   FECHA: 16/02/2026
* */
package Grupo4

fun main() {
    data class Usuario(
        val nombre: String,
        val edad:Int
    )

    val usuarios = listOf(
        Usuario("Iliana",32),
        Usuario("Anderson",21),
        Usuario("Tomy",20)
    )

    val usuariosOrdenados = usuarios.sortedBy { it.edad }

    println("Usuarios sin ordenar: ")
    for (usuario in usuarios) {
        println(usuario.nombre + ", " + usuario.edad)
    }

    println("Usuarios ordenados por edad: ")
    for (usuario in usuariosOrdenados) {
        println(usuario.nombre + ", " + usuario.edad)
    }
}