fun main() {
    println("Escribe una cadena de palabra:")
    val palabra = readLine()!!.lowercase()

    val palindormo = palabra == palabra.reversed()

    if (palindormo) {
        println("La palabra si es palindromo")
    } else {
        println("La palabra no es palindromo")
    }
}
