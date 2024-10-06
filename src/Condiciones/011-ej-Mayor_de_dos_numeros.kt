fun main() {
    print("Escribe el primer valor: ")
    val val1 = readLine()!!.toInt()

    print("Escribe el segundo valor: ")
    val val2 = readLine()!!.toInt()

    val mayor = if (val1 > val2) val1 else val2
    println("El mayor de los dos valores es: $mayor")
}
