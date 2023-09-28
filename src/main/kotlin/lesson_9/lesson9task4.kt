package lesson_9

fun main() {
    println("Введите 5 названий ингридиентов блюда через запятую:")

    val arrayIngridients = readln().split(",")
    if (arrayIngridients.size == 5) {
        arrayIngridients.toTypedArray().sortedArray().forEach {
            println(it)
        }
    } else {
        println("Элементов должно быть 5")
        return main()
    }

}