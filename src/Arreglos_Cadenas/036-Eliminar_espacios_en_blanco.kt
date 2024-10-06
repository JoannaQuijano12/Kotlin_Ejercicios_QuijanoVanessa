fun main() {
    println("Escribe una palabra:")
    val cadena = readLine()!!

    val espacios = cadena.replace(" ", "")

    println("Sin espacios es: $espacios")
}