package lesson_11

fun main() {
    val newUser = User0(0, "Andrew", "1234", "Andrew@gmail.com")
    newUser.viewInformation()
    newUser.writeBio()
    newUser.changePassword()
    newUser.viewInformation()
    newUser.sendEmail()
}

class User0(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    fun viewInformation() {
        println("Данные пользователя: ID: $id, логин: $login, пароль: $password, эл.почта: $email, о себе:$bio")
    }

    fun writeBio() {
        println("Введите информацию о себе:")
        bio = readln()
    }

    fun changePassword() {
        println("Чтобы изменить пароль введите старый:")
        if (readln() == password) {
            println("Теперь введите новый пароль:")
            password = readln()
            println("Ваш новый пароль: $password")
        } else {
            println("Пароль неверный! Попробуйте еще раз")
            return changePassword()
        }
    }

    fun sendEmail() {
        println("Введите сообщение для отправки:")
        val inputMessage = readln()
        println("Сообщение для $login: '$inputMessage'")
    }
}
