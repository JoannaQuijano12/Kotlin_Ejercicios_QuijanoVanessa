fun main() {
    println("Ingresa un número del 1 al 7:")
    val numero = readLine()?.toIntOrNull()

    val dias = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    if (numero != null && numero in 1..7) {
        println("El día correspondiente es: ${dias[numero - 1]}")
    }
}




