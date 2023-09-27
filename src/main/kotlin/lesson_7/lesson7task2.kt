package lesson_7

import kotlin.random.Random

fun main() {
    while (true) {
        val code = Random.nextInt(1000, 9999)

        println("Ваш код авторизации: $code")

        println("Введите ваш код для авторизации:")

        val userCode = readln().toInt()
        if (userCode == code) {
            println("Авторизация завершена, добро пожаловать")
            return
        } else {
            println("Код введен неверно, попробуйте еще раз")
        }
    }
}