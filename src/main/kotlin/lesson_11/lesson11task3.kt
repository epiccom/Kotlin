package lesson_11

class Room(
    val name: String,
    val users: List<User>,
)

class User(
    val name: String,
    val status: String,
)

fun main() {
    val firstUser = User(
        name = "First User",
        status = "mute",
    )
    val secondUser = User(
        name = "Second User",
        status = "speak",
    )
    val room1 = Room(
        name = "Room",
        users = listOf(firstUser, secondUser),
    )
    println("Пользователи комнаты <${room1.name}>: ${room1.users}")
}