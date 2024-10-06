fun main() {
    print("Escribe un numero: ")
    val n = readLine()!!.toInt()

    println("Los numeros pares entre 1 y $n:")
    for (i in 1..n) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}
