fun main() {
    println("Escribe la primera calififcacion")
    val n1 = readln().toDouble();

    println("Escribe la segunda calificacion ")
    val n2 = readln().toDouble();

    println("Escribe la tercera calificacion")
    val n3 = readln().toDouble();

    println("Escribe la cuarta calificacion")
    val n4 = readln().toDouble();

    var promedio = (n1+n2+n3+n4)/4;
    println("El promedio es: $promedio");
}