package lesson_10

fun main() {
    val player = listOf(dice(), dice())
    println("Игроку выпало: $player")

    val comp = listOf(dice(), dice())
    println("Компьютеру выпало: $comp")

    if (player.sum() > comp.sum()) println("Выиграло человечество!")
    else println("Выиграли машины!")
}

fun dice(): Int {
    return (1..6).random()
}