package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

class Posicao {
    var x: Int = 0
    var y: Int = 0

    constructor(x: Int, y: Int) {
        this.x = x
        this.y = y
    }

    fun Posicao(x: Int, y: Int) {
        print("x: $x | y: $y")
    }

    fun alterarPosicaoPara(x: Int, y: Int) {
        this.x = x
        this.y = y
    }

    fun toString(x: Int, y: Int): String? {
        return "Posicao | x: $x | y: $y"
    }


}
