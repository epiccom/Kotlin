package lesson_10

import kotlin.random.Random

fun main() {
    register()
    authorize()
}

var login = ""
var password = ""
fun register() {
    println("Придумайте логин(более 4 символов):")
    login = readln()

    if (login.count() < 4) {
        println("Длина должна быть более 4 символов")
        return register()
    } else {
        println("Ваш логин: $login")
        generatePassword()
    }
}

fun getRandomString(length: Int): String {
    val charset = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    return (1..length)
        .map { charset.random() }
        .joinToString("")
}

fun generatePassword() {
    println("Задайте длину пароля:")
    val length = readln().toInt()

    password = getRandomString(length)

    println("Ваш пароль: $password")
}

fun authorize() {
    println("Введите логин:")
    val inputLogin = readln()
    println("Введите пароль:")
    val inputPassword = readln()

    if (checkLoginPassword(inputLogin, inputPassword)) {
        sendCodeForAuthorization()
    } else {
        println("Логин и/или пароль неверны!")
        return authorize()
    }
}

fun sendCodeForAuthorization() {
    while (true) {
        val code = Random.nextInt(1000, 9999)
        println("Ваш код авторизации: $code")
        println("Введите код для авторизации:")
        if (readln().toInt() == code) {
            println("Авторизация завершена, добро пожаловать")
            break
        } else {
            println("Код введен неверно, попробуйте еще раз")
        }
    }
}

fun checkLoginPassword(inputLogin: String, inputPassword: String): Boolean {
    return inputLogin == login && inputPassword == password
}