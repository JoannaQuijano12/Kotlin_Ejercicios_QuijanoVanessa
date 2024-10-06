fun main() {
    print("Escribe un número: ")
    val numero = readLine()!!.toInt()

    when {
        numero > 0 -> println("Número es positivo.")
        numero < 0 -> println("Número es negativo.")
        else -> println("Número es cero.")
    }
}
