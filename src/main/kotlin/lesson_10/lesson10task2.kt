package lesson_10

fun main() {
    println("Введите логин:")
    val userName = readln()
    println("Введите пароль:")
    val userPassword = readln()

    if (measureLength(userName, userPassword)) println("Логин и пароль недостаточно длинные")
    else println("Добро пожаловать")
}

fun measureLength(login: String, password: String): Boolean {
    return login.count() < 4 && password.count() < 4
}