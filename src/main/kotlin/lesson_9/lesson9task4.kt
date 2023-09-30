package lesson_9

fun main() {
    println("Введите 5 названий ингридиентов блюда через запятую:")
    while (true) {
        val arrayIngridients = readln().split(",").toTypedArray().sortedArray()
        if (arrayIngridients.size == 5) {
            arrayIngridients.forEach {
                println(it)
            }
            return
        } else {
            println("Элементов должно быть 5")
        }
    }
}