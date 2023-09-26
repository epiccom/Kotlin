package lesson_7

fun getRandomString(length: Int): String {
    val charset = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    return (1..length)
        .map { charset.random() }
        .joinToString("")
}

fun main() {
    println("Задайте длину пароля:")
    val length = readln().toInt()

    val randomString = getRandomString(length)

    println(randomString)
}