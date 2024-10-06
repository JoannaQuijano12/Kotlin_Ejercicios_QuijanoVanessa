fun main() {
    println("Escribe una cantidad:")
    val num = readLine()!!.toInt()

    val cantidad = num.toString().length

    println("Tiene $cantidad digitos la cantidad")
}
