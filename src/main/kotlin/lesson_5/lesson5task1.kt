package lesson_5

import kotlin.random.Random

fun main() {
    val sym = Random.nextInt(1,100)
    val sym1 = Random.nextInt(1,100)

    println("Для входа введите сумму чисел: $sym и $sym1")

    val read = readln().toInt()

    if(read == sym+sym1) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}