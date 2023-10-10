package lesson_14

open class Message(
    val author: String,
    val text: String,
) {
    fun sendMessage() {
        println("Автор: $author\nСообщение: \"$text\"")
    }
}

class Comment(
    author: String,
    text: String,
    val authorOfComment: String,
    val textOfComment: String,
) : Message(author, text) {
    fun sendComment() {

        println(
            "Комментарий к сообщению от $author\nТекст сообщения: \"$text\"\nКомментарий: \"$textOfComment\"\n" +
                    "Автор: $authorOfComment"
        )
    }
}

fun main() {
    val messageToForum = Message("Василий", "Объявление для форума")
    val comment = Comment(messageToForum.author, messageToForum.text, "Анатолий", "Комментарий к сообщению")

    messageToForum.sendMessage()
    println()
    comment.sendComment()
}