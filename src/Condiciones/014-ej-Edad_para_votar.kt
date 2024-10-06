fun main() {
    print("Escribe tu edad: ")
    val edad = readLine()!!.toInt()

    if (edad >= 18) {
        println("Ya puedes votar.")
    } else {
        println("Aun no puedes votar.")
    }
}
