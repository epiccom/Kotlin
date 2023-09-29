package lesson_8

fun main() {
    println("Сколько ингридиентов будет в рецепте?")
    val amt = readln().toInt()
    val ingredients = Array(amt) { readln() }

    println("Ингридиенты: ${ingredients.joinToString()}")
}