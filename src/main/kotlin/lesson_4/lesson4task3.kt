package lesson_4

fun main() {
    val weather = true
    val tent = true
    val wet = 20
    val partOfYear = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых?${(weather == true) && (tent == true) && (wet == 20) && (partOfYear != "зима")}")
}