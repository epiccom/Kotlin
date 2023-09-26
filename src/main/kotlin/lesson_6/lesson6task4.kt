package lesson_6

import kotlin.random.Random

fun main() {
    val winNum = Random.nextInt(1, 9)
    var attempts = 5
    println("Угадайте число от 1 до 9, у вас $attempts попыток")

    while (attempts > 0) {
        val userNum = readln().toInt()
        if (userNum == winNum) {
            println("Это была великолепная игра!")
            attempts = 0
        } else {
            println("Неверно! Осталось попыток ${--attempts}")
        }
    }
    println("Было загадано число $winNum")
}