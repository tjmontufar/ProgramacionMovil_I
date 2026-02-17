/*
*   ALUMNO: Tomy Jose Montufar Zuniga
*   CUENTA: 202310050054
*   ASIGNATURA: Programacion Movil I
*   FECHA: 16/02/2026
* */
package Grupo3

class ControlDeFlujo {
    fun ejemplo(numero:Int) {
        if (numero < 0) {
            println("Numero no valido")
            return
        }

        for (i in 1..numero) {
            if (i==5) {
                println("Se ha saltado el numero 5")
                continue
            }

            if (i==8) {
                println("Se detuvo el ciclo en el numero 8")
                break
            }

            println("Numero: $i")
        }

        println("Fin del programa.")
    }
}

fun main() {
    val control = ControlDeFlujo()
    print("Ingrese un numero: ")
    val numero = readLine()!!.toInt()
    control.ejemplo(numero)
}