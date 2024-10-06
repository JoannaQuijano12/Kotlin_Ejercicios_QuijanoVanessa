fun main() {
    print("Escribe un número: ")
    val n = readLine()!!.toInt()

    println("Los multiplos de 5 entre 1 es $n:")
    for (i in 1..n) {
        if (i % 5 == 0) {
            println(i)
        }
    }
}
