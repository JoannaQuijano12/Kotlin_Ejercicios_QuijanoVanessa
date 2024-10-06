fun main() {
    println("Escribe un numero:")
    val num = readLine()!!.toInt()

    val invertir = num.toString().reversed().toInt()

    println("El numero invertido es: $invertir")
}