fun main() {
    println("Escribe una cadena de vocales:")
    val palabra = readLine()!!.lowercase()

    val vocales = palabra.count { it in "aeiouAEIOU" }

    println("Tienes  $vocales vocales")
}