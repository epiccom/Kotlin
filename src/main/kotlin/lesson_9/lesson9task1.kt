package lesson_9

fun main() {
    val ingredients = listOf("мука", "молоко", "вода", "яйцо", "соль", "фарш", "лук", "перец")

    println("В рецепте есть следующие ингредиенты: $ingredients")

    ingredients.forEach {
        println(it)
    }
}