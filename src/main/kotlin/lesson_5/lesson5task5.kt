package lesson_5

import kotlin.random.Random

fun main() {
    val firstNum = Random.nextInt(1, 100)
    val secondNum = Random.nextInt(1, 100)
    println("Введите два числа от 1 до 100 через запятую, например : 10,45")

    val input = readln()
    val result = input.split(",")
    val fsInput = result[0].toInt()
    val scInput = result[1].toInt()

    if ((fsInput == firstNum && scInput == secondNum) || (fsInput == secondNum && scInput == firstNum))
        println("Поздравляем! Вы выиграли главный приз!")
    else if (fsInput == firstNum || scInput == secondNum || fsInput == secondNum || scInput == firstNum)
        println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")

    println("Для победы нужны были числа: $firstNum и $secondNum")
}