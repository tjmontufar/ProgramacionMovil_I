/*
*   ALUMNO: Tomy Jose Montufar Zuniga
*   CUENTA: 202310050054
*   ASIGNATURA: Programacion Movil I
*   FECHA: 16/02/2026
* */
package Grupo1

val variableglobal = "Hola soy una variable global."

fun main() {
    print("Ingrese el numero 1: ")
    val numero1:Int = readln().toInt()
    print("Ingrese el numero 2: ")
    val numero2:Int = readln().toInt()
    print("Escoja la operacion que desea realizar: ")
    val operador:String = readln().toString()

    suma(numero1,numero2)
    resta(numero1,numero2)
    multiplicacion(numero1,numero2)
    division(numero1,numero2)
    println(variableglobal)
}

fun suma(valor1:Int, valor2:Int) {
    println("$valor1 + $valor2 = ${valor1+valor2}")
}
fun resta(valor1:Int, valor2:Int) {
    println("$valor1 - $valor2 = ${valor1-valor2}")
}
fun multiplicacion(valor1:Int, valor2:Int) {
    println("$valor1 x $valor2 = ${valor1*valor2}")
}
fun division(valor1:Int, valor2:Int) {
    println("$valor1 / $valor2 = ${valor1/valor2}")
}