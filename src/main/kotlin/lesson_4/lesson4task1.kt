package lesson_4

fun main() {
    val reservedToday = 13
    val reservedTomorrow = 9

    println("Доступность столиков на сегодня:${reservedToday < TABLES}\nДоступность столиков на завтра:${reservedTomorrow < TABLES}")
}

const val TABLES = 13