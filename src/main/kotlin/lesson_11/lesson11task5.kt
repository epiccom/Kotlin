package lesson_11

class Forum(
    var members: List<User0>,
    var messages: List<Message>,
) {
    fun createNewUser(
        userId: Int,
        userLogin: String,
        userPassword: String,
        userEmail: String,
    ) {
        members = listOf(User0(userId, userLogin, userPassword, userEmail))
    }

    fun createNewMessage(
        authorId: Int,
        author: String,
        textOfMessage: String,
    ) {
        messages = listOf(Message(authorId, author, textOfMessage))
    }

    fun printThread() {
        println(messages)
    }
}

class Message(
    val authorId: Int,
    val author: String,
    val textOfMessage: String,
)

fun main() {
    val forum = Forum(listOf(), listOf())
    forum.createNewUser(0, "user 1", "1234", "mail1@mail.com")
    forum.createNewUser(1, "user 2", "4321", "mail2@mail.com")

    forum.createNewMessage(0, "user 1", "сообщение 1")
    forum.createNewMessage(1, "user 2", "сообщение 2")

    forum.printThread()

}