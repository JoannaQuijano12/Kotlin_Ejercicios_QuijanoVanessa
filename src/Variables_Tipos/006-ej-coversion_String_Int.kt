fun main() {
    println("Escribe una cadena de texto:")
    val input = readLine()

    try {
        val valor = input?.toInt()
        println("El valor convertido es: $valor")
    } catch (e: NumberFormatException) {
        println("Error: No se pudo convertir la cadena a un número entero.")
    }
}


