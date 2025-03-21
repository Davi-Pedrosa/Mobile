package main.kotlin.ExFuncionario

class Formula {
    object calculos{
        fun media(val1:Double, val2:Double):Double{
            return (val1+val2)/2
        }
    }
    object Reajustes{
        val janeiro: Double = 0.9
        val fevereiro: Double = 1.2
        val marco:Double = 1.0
    }
}

fun main(){

    val resultado= Formula.calculos.media(6.7,4.3)
    val reajusteJaneiro = Formula.Reajustes.janeiro

    println("a Media é $resultado")
}