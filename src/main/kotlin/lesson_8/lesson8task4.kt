package lesson_8

fun main() {
    val ingredients = arrayOf("мука", "молоко", "вода", "яйцо", "соль", "фарш", "лук", "перец")
    println("Ингридиенты: ${ingredients.joinToString()}")
    println("Какой ингридиент заменить?:")
    val searchIngred = readln()

    for (i in ingredients) {
        if (i == searchIngred) {
            println("На какой ингридиент заменить?")
            val change = readln()
            val changeIdx = ingredients.indexOf(searchIngred)
            ingredients[changeIdx] = change
            println("Новый список: ${ingredients.joinToString()}")
            return
        } else {
            println("Такого ингредиента в рецепте нет")
            return
        }
    }
}