package lesson_18

open class Dice0 {
    open fun rollDice() {}
}
class Dice4 : Dice0() {
    override fun rollDice() {
        println("Выпало ${(1..4).random()}")
    }
}
class Dice6 : Dice0() {
    override fun rollDice() {
        println("Выпало ${(1..6).random()}")
    }
}
class Dice8 : Dice0() {
    override fun rollDice() {
        println("Выпало ${(1..8).random()}")
    }
}