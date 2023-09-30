package lesson_10

import kotlin.random.Random

fun main() {
    registration()
    authorization()
}

var login = ""
var password = ""
fun registration() {
    println("Придумайте логин(более 4 символов):")
    login = readln()

    if (login.count() < 4) {
        println("Длина должна быть более 4 символов")
        return registration()
    } else {
        println("Ваш логин: $login")
        passGenerator()
    }
}

fun getRandomString(length: Int): String {
    val charset = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    return (1..length)
        .map { charset.random() }
        .joinToString("")
}

fun passGenerator() {
    println("Задайте длину пароля:")
    val length = readln().toInt()

    password = getRandomString(length)

    println("Ваш пароль: $password")
}

fun authorization() {
    println("Введите логин:")
    val inputLogin = readln()
    println("Введите пароль:")
    val inputPassword = readln()

    if (inputLogin == login && inputPassword == password) {
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
    } else {
        println("Логин и/или пароль введены неверно, попробуйте еще раз")
        return authorization()
    }
}