package lesson_10

fun main() {

    val human = rolledDice()
    println("Игроку выпало: $human")

    val comp = rolledDice()
    println("Компьютеру выпало: $comp")

    if (human > comp) println("Выиграло человечество!")
    else println("Выиграли машины!")
}

fun rolledDice(): Int {
    val dice1 = (1..6).random()
    val dice2 = (1..6).random()
    return dice1 + dice2
}
