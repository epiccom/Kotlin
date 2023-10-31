package lesson_17

class User2(login: String, password: String) {
    var login = login
        set(value) {
            println("Вы поменяли логин на $value")
            field = value
        }
    var password = password
        get() {
            return (1..field.count())
                .map { '*' }
                .joinToString("")
        }
        set(value) {
            println("Вы не можете изменить пароль")
        }

}

fun main() {
    val user = User2("login", "12345678")
    user.login = "new login"
    user.password = "asd"
    println("Пароль пользователя ${user.login}: ${user.password}")
}