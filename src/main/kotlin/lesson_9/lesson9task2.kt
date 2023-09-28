package lesson_9

fun main() {
    val ingredients = mutableListOf("мука", "молоко", "вода")

    println("В рецепте есть базовые ингредиенты: $ingredients")

    println("Желаете добавить еще?")
    val answer = readln()
    if (answer == "да") {
        println("Какой ингредиент вы хотите добавить?")
        val add = readln()
        ingredients.add(add)
    } else {
        return
    }
    println("Теперь в рецепте есть следующие ингредиенты: $ingredients")

}