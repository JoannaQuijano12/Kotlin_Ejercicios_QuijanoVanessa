fun main() {
    println("Escribe un valor entero:")
    val valor = readLine()?.toIntOrNull()

    if (valor != null) {
        if (valor % 2 == 0) {
            println("$valor es un valor par.")
        } else {
            println("$valor es un valor impar.")
        }
    } else {
        println("Error: Lo que escribiste no es un valor correcto.")
    }
}



