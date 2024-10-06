fun main() {
    print("Escribe el número: ")
    val num = readLine()!!.toInt()

    println("La tabla de multiplicar del $num es:")
    for (i in 1..10) {
        println("$num x $i = ${num * i}")
    }
}

