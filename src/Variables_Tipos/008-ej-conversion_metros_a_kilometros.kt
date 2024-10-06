fun main() {
    println("Escribe tu distancia en metros:")
    val metros = readLine()?.toDoubleOrNull()

    if (metros != null) {
        val kilometros = metros / 1000
        println("$metros los metros son $kilometros kilómetros.")
    } else {
        println("Error: No ingresaste un número válido.")
    }
}

