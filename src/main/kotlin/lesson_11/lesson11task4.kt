package lesson_11

class Contact(
    val avatar: String,
    val firstName: String,
    val secondName: String,
    val number: Int,
    val homeNumber: Int,
    val email: String,
    val favoriteContacts: List<FavoriteContacts>,
) {
    fun sendMessage() {
        println("написать")
    }

    fun call() {
        println("вызов")
    }

    fun videoCall() {
        println("видео")
    }

    fun sendEmail() {
        println("почта")
    }

    fun callInFaceTime() {
        println("Face Time")
    }
}

class FavoriteContacts(
    val name: String,
    val number: String,
)

fun main() {
    val wifeContact = FavoriteContacts(
        name = "жена",
        number = "userName",
    )
    val girlfriend1Contact = FavoriteContacts(
        name = "подруга",
        number = "userName",
    )
    val girlfriend2Contact = FavoriteContacts(
        name = "подруга",
        number = "userName",
    )
    val contact = Contact(
        avatar = "Аватар",
        firstName = "First Name",
        secondName = "Second Name",
        number = "8(999) 999-42-42",
        homeNumber = "8(999) 888-42-42",
        email = "mail@mail.ru",
        favoriteContacts = listOf(wifeContact, girlfriend1Contact, girlfriend2Contact)
    )
}