package lesson_16

class Profile0(val login: String, private val password: Int) {
    private val userPassword = 1234
    fun checkPassword() {
        if (password == userPassword) println("Пароль введен верно")
        else println("Пароль введен не верно")
    }
}

fun main() {
    val user = Profile0("Login",12345)
    user.checkPassword()
}