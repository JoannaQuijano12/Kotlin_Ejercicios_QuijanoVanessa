fun main() {

    print("Escribe el primer valor de la variable: ")
    var a = readLine()?.toIntOrNull() ?: 0

    print("Escribe el segundo valor de la variable: ")
    var b = readLine()?.toIntOrNull() ?: 0

    println("Antes de hacer el  intercambio: a = $a, b = $b")

    val cambio = a
    a = b
    b = cambio

    println("Después de hacer el intercambio intercambio: a = $a, b = $b")
}