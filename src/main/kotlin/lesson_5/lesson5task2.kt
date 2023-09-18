package lesson_5

import java.time.LocalDate

fun main() {
    println("Введите год рождения:")

    val yearOfBirth = readln().toInt()
    val year = LocalDate.now().year

    if(year - yearOfBirth >= AGE_OF_MAJORITY)
        println("Показать экран со скрытым контентом")
    else println("Вернуться на главный экран")
}

const val AGE_OF_MAJORITY = 18