package Acuario

class Acuario(var largo: Int = 100, var ancho: Int = 20, var alto: Int = 40) {
    fun imprimirTamano() {
        println("Ancho: $ancho cm " +
                "Largo: $largo cm " +
                "Alto: $alto cm "
        )
        // 1 l = 1000 cm^3
        println("Volumen: $volumen l")
    }
    init {
        println("inicializando acuario")
    }

    constructor(numeroDePeces: Int) : this() {
        // 2,000 cm^3 por pez + espacio extra para que no se derrame

        val tanque = numeroDePeces * 2000 * 1.1
        alto = (tanque / (largo * ancho)).toInt()
    }
    val volumen: Int
        get() = ancho * alto * largo / 1000  // 1000 cm^3 = 1 l
}
