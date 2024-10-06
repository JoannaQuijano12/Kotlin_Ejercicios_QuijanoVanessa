fun main() {
    val numeros = arrayOf(1,2,7,3,4,4,5,5,9,8,9,9,8,6,5,5,4,3,2,1,1,4,5,7,8,0)

    val repetidos = numeros.groupBy { it }.filter { it.value.size > 1 }.keys

    println("Los numeros repetidos son: $repetidos")
}
