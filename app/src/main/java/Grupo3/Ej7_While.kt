/*
*   ALUMNO: Tomy Jose Montufar Zuniga
*   CUENTA: 202310050054
*   ASIGNATURA: Programacion Movil I
*   FECHA: 16/02/2026
* */
package Grupo3

class Validador {
    fun iniciarSesion() {
        val claveCorrecta = "1234"
        var clave = ""

        while (clave != claveCorrecta) {
            print("Ingrese la clave: ")
            clave = readLine()!!

            if (clave != claveCorrecta) {
                println()
            }
        }
    }
}