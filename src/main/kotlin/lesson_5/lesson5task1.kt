package lesson_5

fun main() {
    val a = (1..100).random()
    val b = (1..100).random()

    println("Для входа введите сумму чисел: $a и $b")

    val result = readln().toInt()

    if (result == a + b) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}