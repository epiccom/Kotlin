package lesson_16

class Dice() {
    var random: Int = 0
    fun rollDice() {
        random = (1..6).random()
        println("Выпало $random")
    }
}

fun main() {
    val dice = Dice()
    dice.rollDice()
}