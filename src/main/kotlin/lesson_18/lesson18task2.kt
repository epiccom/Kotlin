package lesson_18

abstract class Dice0 {
    open fun rollDice(amt: Int) {}
}
class Dice1 : Dice0() {
    override fun rollDice(amt: Int) {
        println("Выпало ${(1..amt).random()}")
    }
}

fun main() {
    val dice = Dice1()
    dice.rollDice(4)
    dice.rollDice(6)
    dice.rollDice(8)
}