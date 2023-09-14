package lesson_4

fun main() {
    val tables = 13
    val reservedToday = 13
    val reservedTomorrow = 9

    println("Доступность столиков на сегодня:${reservedToday < tables}\nДоступность столиков на завтра:${reservedTomorrow < tables}")
}