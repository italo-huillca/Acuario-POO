package acuario
import Acuario.Acuario

fun construirAcuario() {
    val acuario1 = Acuario()
    acuario1.imprimirTamano()
    // altura y largo por defecto
    val acuario2 = Acuario(ancho = 25)
    acuario2.imprimirTamano()
    // ancho por defecto
    val acuario3 = Acuario(alto = 35, largo = 110)
    acuario3.imprimirTamano()
    // todo personalizado
    val acuario4 = Acuario(ancho = 25, alto = 35, largo = 110)
    acuario4.imprimirTamano()
    val acuario6 = Acuario(numeroDePeces = 29)
    acuario6.imprimirTamano()
    println("Volumen: ${acuario6.ancho * acuario6.largo * acuario6.alto / 1000} l")
}


fun main() {
    construirAcuario()
}
