package lesson_11

class Room(
    val cover: String,
    val name: String,
    val members: List<User1>,
)

class User1(
    val avatar: String,
    val name: String,
    val status: String,
)

fun main() {
    val firstUser = User1(
        avatar = "Аватар 1",
        name = "Имя 1",
        status = "разговаривает",
    )
    val secondUser = User1(
        avatar = "Аватар 1",
        name = "Имя 2",
        status = "микрофон выключен",
    )
    val firstRoom = Room(
        cover = "Обложка 1",
        name = "Комната 1",
        members = listOf(firstUser, secondUser)
    )

}