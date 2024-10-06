fun main() {
    print("Primer número: ")
    val num1 = readLine()!!.toInt()

    print("Segundo número: ")
    val num2 = readLine()!!.toInt()

    var resultado = 0
    for (i in 1..num2) {
        resultado += num1
    }

    println("Resultado de la multiplicación es: $resultado")
}
