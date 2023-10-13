package lesson_15

abstract class Profile(val name: String) {
    fun readForum() {
        println("$name читает форум")
    }

    fun writeMessage() {
        println("$name пишет сообщение на форум")
    }
}

class User(name: String) : Profile(name)
class Administrator(name: String) : Profile(name) {
    fun deleteMessage() {
        println("$name удалил сообщение")
    }
    fun deleteUser() {
        println("$name удалил пользователя")
    }
}
fun main() {
    val user = User("Пользователь")
    val administrator = Administrator("Администратор")

    user.readForum()
    user.writeMessage()
    administrator.readForum()
    administrator.writeMessage()
    administrator.deleteMessage()
    administrator.deleteUser()
}