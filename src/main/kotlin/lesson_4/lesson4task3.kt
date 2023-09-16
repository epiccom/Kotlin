package lesson_4

fun main() {
    println(
        "Благоприятные ли условия сейчас для роста бобовых?" +
        "${(WEATHER == true) && (TENT == true) && (WET == 20) && (PART_OF_YEAR != "зима")}"
    )
}

const val WEATHER = true
const val TENT = true
const val WET = 20
const val PART_OF_YEAR = "зима"