package lesson_9

fun main() {
    val omelette = mutableListOf(2, 50, 15)

    println("Сколько порций омлета приготовить?")
    val amt = readln().toInt()

    val result = omelette.map {
        it * amt
    }
    println(
        "На $amt порций вам понадобится: Яиц – ${result[0]}, " +
                "молока – ${result[1]}, " +
                "сливочного масла – ${result[2]}"
    )
}