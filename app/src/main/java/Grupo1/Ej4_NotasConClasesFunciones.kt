/*
*   ALUMNO: Tomy Jose Montufar Zuniga
*   CUENTA: 202310050054
*   ASIGNATURA: Programacion Movil I
*   FECHA: 16/02/2026
* */
package Grupo1

class Estudiante(val nombre: String?, var nota1: Double, var nota2: Double, var nota3: Double) {

    fun calcularPromedio(): Double {
        return (nota1 + nota2 + nota3) / 3
    }

    fun aprobo(): Boolean {
        return calcularPromedio() >= 60
    }

    fun mostrarInformacion() {
        println("Estudiante: $nombre")
        println("Promedio: ${calcularPromedio()} %")
        println("Aprobo: ${aprobo()}")
    }
}

fun main() {
    println("Ingrese el nombre del estudiante")
    val nombre =readln().toString()

    println("Ingrese las notas:")
    val n1 = readln().toDouble()
    val n2 = readln().toDouble()
    val n3 = readln().toDouble()
    //val estudiante = Estudiante("Cristtell",n1,n2,n3)
    val estudiante = Estudiante(nombre,n1, n2, n3)
    estudiante.mostrarInformacion()
}