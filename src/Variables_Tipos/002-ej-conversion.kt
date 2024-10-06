fun main() {

    print("Escribe la temperatura en grados Celsius: ")
    val celsius = readLine()?.toDoubleOrNull()

    if (celsius != null) {
        val fahrenheit = (celsius * 9/5) + 32
        println("$celsius Los grados Celsius son $fahrenheit A grados Fahrenheit.")
    } else {
        println("Por favor, introduce un valor válido.")
    }
}
