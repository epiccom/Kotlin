package lesson_8

fun main() {
    val ingredients = arrayOf("мука", "молоко", "вода", "яйцо", "соль", "фарш", "лук", "перец")
    println("Введите название ингридиента:")
    val searchIngred = readln()

    for (i in ingredients) {
        if (i == searchIngred) {
            println("Ингридиент $searchIngred в рецепте есть")
            return
        } else {
            println("Такого ингредиента в рецепте нет")
            return
        }
    }
}