fun main() {
    print("Tu calificación es (0-100): ")
    val calificacion = readLine()!!.toInt()

    val letra = when {
        calificacion in 90..100 -> "A"
        calificacion in 80..89 -> "B"
        calificacion in 70..79 -> "C"
        calificacion in 60..69 -> "D"
        calificacion in 0..59 -> "F"
        else -> "Tu calificación no es válida"
    }
    println("Tu calificación en letra es: $letra")
}
