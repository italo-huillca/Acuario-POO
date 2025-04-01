package Acuario


class Acuario(var largo: Int = 100, var ancho: Int = 20, var alto: Int = 40) {
    fun imprimirTamano() {
        println("Ancho: $ancho cm " +
                "Largo: $largo cm " +
                "Alto: $alto cm ")
    }
    init {
        println("inicializando acuario")
    }
    init {
        // 1 litro = 1000 cm^3
        println("Volumen: ${ancho * largo * alto / 1000} l")
    }
    constructor(numeroDePeces: Int) : this() {
        // 2,000 cm^3 por pez + espacio extra para que no se derrame

        val tanque = numeroDePeces * 2000 * 1.1
        alto = (tanque / (largo * ancho)).toInt()
    }
}
