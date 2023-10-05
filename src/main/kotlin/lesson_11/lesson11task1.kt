package lesson_11

class User0(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

fun main() {
    val user1 = User0(0, "User name", "12345", "user-email@gmail.com")
    val user2 = User0(1, "Second user", "qwerty", "second-email@gmail.com")
    println("Данные пользователя 1: ID: ${user1.id}, логин: ${user1.login}, пароль: ${user1.password}, эл.почта: ${user1.email}")
    println("Данные пользователя 2: ID: ${user2.id}, логин: ${user2.login}, пароль: ${user2.password}, эл.почта: ${user2.email}")
}