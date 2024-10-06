fun main() {
    print("Primer valor: ")
    val val1 = readLine()!!.toInt()

    print("Segundo valor: ")
    val val2 = readLine()!!.toInt()

    print("Tercer valor: ")
    val val3 = readLine()!!.toInt()

    val valores = listOf(val1, val2, val3).sorted()

    println("Menor es: ${valores[0]}")
    println("Intermedio es: ${valores[1]}")
    println("Mayor es: ${valores[2]}")
}
