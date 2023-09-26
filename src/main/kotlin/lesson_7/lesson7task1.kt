package lesson_7

fun main() {
    val sym1 = 'a'..'z'
    val sym2 = 1..9
    val sym3 = 'a'..'z'
    val sym4 = 1..9
    val sym5 = 'a'..'z'
    val sym6 = 1..9

    val password = "${sym1.random()}${sym2.random()}${sym3.random()}${sym4.random()}${sym5.random()}${sym6.random()}"

    println(password)
}