package lesson_10

fun main() {
    println("Введите логин:")
    val userName = readln()
    println("Введите пароль:")
    val userPassword = readln()

    lenghtMeter(userName, userPassword)

}

fun lenghtMeter(login: String, password: String) {
    if (login.count() < 4 && password.count() < 4) println("Логин и пароль недостаточно длинные")
    else println("Добро пожаловать")
}