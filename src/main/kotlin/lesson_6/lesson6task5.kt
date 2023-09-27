package lesson_6

import kotlin.random.Random

fun main() {
    var attempts = 3

    while (attempts > 0) {
        val firstNum = Random.nextInt(1, 9)
        val secondNum = Random.nextInt(1, 9)

        println("Введите сумму чисел: $firstNum и $secondNum. Осталось попыток: $attempts")

        val result = readln().toInt()
        if (result == firstNum + secondNum) {
            println("Добро пожаловать!")
            return
        } else {
            print("Неверно!")
            --attempts
        }
    }
    println("Доступ запрещен!")

}