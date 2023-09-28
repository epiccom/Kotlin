package lesson_8

fun main () {
    println("Сколько ингридиентов будет в рецепте?")
    var amt = readln().toInt()
    var ingredients = Array<String>(0){""}

    while (amt > 0) {
        println("Какой ингридиент добавить? Осталось: $amt")
        val add = readln()
        ingredients += add
        amt--

    }
    println("Ингридиенты: ${ingredients.joinToString()}")
}