package lesson_5

fun main() {

    println("Введите два числа от 1 до 100 через запятую, например : 10,45")

    val input = readln()
    val result = input.split(",")
    val fsInput = result[0].toInt()
    val scInput = result[1].toInt()

    if ((fsInput == FIRST_NUM && scInput == SECOND_NUM) || (scInput == FIRST_NUM && fsInput == SECOND_NUM))
        println("Поздравляем! Вы выиграли главный приз!")
    else if (fsInput == FIRST_NUM || scInput == SECOND_NUM || fsInput == SECOND_NUM || scInput == FIRST_NUM)
        println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")

    println("Для победы нужны были числа: $FIRST_NUM и $SECOND_NUM")
}

const val FIRST_NUM = 6
const val SECOND_NUM = 16