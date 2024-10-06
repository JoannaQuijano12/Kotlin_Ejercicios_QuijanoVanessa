fun main() {
    println("Numero:")
    val num = readLine()!!.toInt()

    var primo = true

    if (num < 2) primo = false

    for (i in 2..num / 2) {
        if (num % i == 0) {
            primo = false
            break
        }
    }

    if (primo) {
        println("El $num es primo")
    } else {
        println("El $num no es primo")
    }
}
