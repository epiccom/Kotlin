package lesson_4

fun main() {
    val hands = ODD
    val legs = EVEN
    val back = EVEN
    val abdominal = ODD

    println(
        """
        Упражнения для рук:   $hands
        Упражнения для ног:   $legs
        Упражнения для спины: $back
        Упражнения для пресса:$abdominal
    """.trimIndent()
    )
}
const val DAY_NOW = 5
const val EVEN: Boolean = DAY_NOW % 2 == 0
const val ODD: Boolean = DAY_NOW % 2 != 0