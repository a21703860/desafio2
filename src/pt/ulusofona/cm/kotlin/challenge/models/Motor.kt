package pt.ulusofona.cm.kotlin.challenge.models

class Motor {
    val cavalos: Int
    val cilindrada: Int
    val ligado: Boolean = true

    constructor(cavalos: Int, cilindrada: Int) {
        this.cavalos = cavalos
        this.cilindrada = cilindrada
    }

    fun Motor(cavalos: Int, cilindrada: Int) {

    }

    fun toString(cavalos: Int, cilindrada: Int): String? {
        return "Motor | $cavalos | $cilindrada"
    }
}