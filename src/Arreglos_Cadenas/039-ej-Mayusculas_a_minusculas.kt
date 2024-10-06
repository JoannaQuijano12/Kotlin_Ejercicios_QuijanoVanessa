fun main() {
    println("Escribe una palabra en forma de mayusculas:")
    val palabra = readLine()!!

    val minusculas = palabra.lowercase()

    println("La palabra en minusculas es: $minusculas")
}
