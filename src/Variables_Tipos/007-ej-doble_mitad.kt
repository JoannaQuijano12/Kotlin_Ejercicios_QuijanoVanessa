fun main() {
    println("Escribe un numero:")
    val numero = readLine()?.toDoubleOrNull()

    if (numero != null) {
        println("El doble del $numero es: ${numero * 2}")
        println("La mitad del $numero es: ${numero / 2}")
    } else {
        println("Error: Lo que escribiste no es un numero.")
    }
}


