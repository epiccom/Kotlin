package lesson_16

class Profile0(private val userPassword: Int) {
    fun checkPassword(password: Int) {
        if (password == userPassword) println("Пароль введен верно")
        else println("Пароль введен не верно")
    }
}

fun main() {
    val user = Profile0(12345)
    user.checkPassword(1234)
}