package lesson_6

fun main() {
    println("Придумайте имя пользователя:")
    val newUserName = readln()
    println("Теперь установите пароль:")
    val newUserPass = readln()
    println("Регистрация завершена. Введите имя пользователя для входа:")
    val userName = readln()
    if(userName == newUserName) {
        println("Теперь введите пароль:")
        val userPass = readln()
        if(userPass == newUserPass) println("Авторизация прошла успешно")
        else println("Пароль введен неверно")
    } else {
        println("Пользователь с таким именем не найден")
    }

}