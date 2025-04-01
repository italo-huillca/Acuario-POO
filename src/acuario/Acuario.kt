package Acuario


class Acuario(var largo: Int = 100, var ancho: Int = 20, var alto: Int = 40) {
    fun imprimirTamano() {
        println("Ancho: $ancho cm " +
                "Largo: $largo cm " +
                "Alto: $alto cm ")
    }
}
