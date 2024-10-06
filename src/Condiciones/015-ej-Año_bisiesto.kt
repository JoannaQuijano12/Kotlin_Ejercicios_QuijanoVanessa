fun main() {
    print("Escribe un año: ")
    val año = readLine()!!.toInt()

    val esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)

    if (esBisiesto) {
        println("El año $año es bisiesto.")
    } else {
        println("El año $año no es bisiesto.")
    }
}
