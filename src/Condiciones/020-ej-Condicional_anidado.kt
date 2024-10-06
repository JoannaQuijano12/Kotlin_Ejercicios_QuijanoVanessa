fun main() {
    print("Numero del 1 al 12: ")
    val numero = readLine()!!.toInt()

    val mes = when (numero) {
        1 -> "Enero"
        2 -> "Febrero"
        3 -> "Marzo"
        4 -> "Abril"
        5 -> "Mayo"
        6 -> "Junio"
        7 -> "Julio"
        8 -> "Agosto"
        9 -> "Septiembre"
        10 -> "Octubre"
        11 -> "Noviembre"
        12 -> "Diciembre"
        else -> "El numero que pusiste no tiene mes"
    }
    println("Mes seleccionado es: $mes")
}
