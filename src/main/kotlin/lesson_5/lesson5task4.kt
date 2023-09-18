package lesson_5

fun main() {
    println("Введите имя пользователя:")

    val userName = readln()

    if (userName == USER_NAME) {
        println("Теперь введите пароль:")
        val userPass = readln()
        if (userPass == USER_PASS) println("Авторизация прошла успешно, добро пожаловать на борт!")
        else println("Не верный пароль!")
    } else println("Пользователь не найден, хотите зарегестрироваться?")
}

const val USER_NAME = "Zaphod"
const val USER_PASS = "PanGalactic"