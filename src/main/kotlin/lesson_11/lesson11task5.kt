package lesson_11

class Forum(
    val members: MutableList<User0> = mutableListOf(),
    val messages: MutableList<Message> = mutableListOf(),
) {
    fun createNewUser(
        userId: Int,
        userLogin: String,
        userPassword: String,
        userEmail: String,
    ) {
        members.add(User0(userId, userLogin, userPassword, userEmail))
    }

    fun createNewMessage(
        authorId: Int,
        author: String,
        textOfMessage: String,
    ) {
        messages.add(Message(authorId, author, textOfMessage))
    }

    fun printThread() {
        println(messages[0])
        println(messages[1])
    }
}

class Message(
    val authorId: Int,
    val author: String,
    val textOfMessage: String,
)

fun main() {
    val forum = Forum()
    forum.createNewUser(0, "user 1", "1234", "mail1@mail.com")
    forum.createNewUser(1, "user 2", "4321", "mail2@mail.com")

    forum.createNewMessage(0, "user 1", "сообщение 1")
    forum.createNewMessage(1, "user 2", "сообщение 2")

    forum.printThread()

}