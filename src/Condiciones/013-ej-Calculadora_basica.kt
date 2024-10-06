fun main() {
    print("Escribe el primer número: ")
    val num1 = readLine()!!.toDouble()

    print("Escribe el segundo número: ")
    val num2 = readLine()!!.toDouble()

    print("Selecciona una operación (+, -, *, /): ")
    val operacion = readLine()

    val resultado = when (operacion) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else "No se puede dividir por cero"
        else -> "Operación no válida"
    }
    println("Tu resultado es: $resultado")
}
