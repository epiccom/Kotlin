package lesson_8

fun main() {
    val ingredients = arrayOf("мука", "молоко", "вода", "яйцо", "соль", "фарш", "лук", "перец")
    println("Введите название ингридиента:")
    val searchIngred = readln()

        if (searchIngred in ingredients) {
            println("Ингридиент $searchIngred в рецепте есть")
        } else {
            println("Такого ингредиента в рецепте нет")
        }

}