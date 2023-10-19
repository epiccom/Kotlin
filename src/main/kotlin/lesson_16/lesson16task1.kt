package lesson_16

class Dice() {
    private var random = (1..6).random()
    fun rollDice() {
        println("Выпало $random")
    }
}

fun main() {
    val dice = Dice()
    dice.rollDice()
}