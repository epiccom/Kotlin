package lesson_10

fun main() {

    val humansResult = rolledDice()
    println("Игроку выпало: $humansResult")

    val computerResult = rolledDice()
    println("Компьютеру выпало: $computerResult")

    if (humansResult > computerResult) println("Выиграло человечество!")
    else println("Выиграли машины!")
}

fun rolledDice(): Int {
    val dice1 = (1..6).random()
    val dice2 = (1..6).random()
    return dice1 + dice2
}
