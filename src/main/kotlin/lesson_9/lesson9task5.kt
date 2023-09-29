package lesson_9

import java.util.*

fun main() {

    println("Введите и отправьте 5 ингридиентов по очереди:")
    val ingredients = Array(5) { readln() }.toSet()

    println(ingredients.joinToString(", ", "", ".")
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
}
