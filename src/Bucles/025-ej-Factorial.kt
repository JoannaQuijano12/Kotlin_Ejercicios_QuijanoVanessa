fun main() {
    print("Numero: ")
    val n = readLine()!!.toInt()

    var factorial = 1L
    for (i in 1..n) {
        factorial *= i
    }

    println("Factorial de $n es: $factorial")
}
