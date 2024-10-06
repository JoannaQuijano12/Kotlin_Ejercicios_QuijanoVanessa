fun main() {
    println("El precio del producto:")
    val costo = readLine()!!.toDouble()

    val descuento = if (costo > 1000) costo * 0.20 else 0.0

    val preciofin = costo - descuento

    println("Precio final: $preciofin")
}
