package lesson_4

fun main() {
    println(
        """
    Введите данные в формате:[Повреждения,Экипаж,Провизия,Погода]
    Пример вводных данных: [true,50,45,false]
    """.trimIndent()
    )
    val input = readln()
    val sym = ","
    val result = input.split(sym)
    val damage: String = result[0]
    val team = result[1].toInt()
    val food = result[2].toInt()
    val weather: String = result[3]

    if (damage == "false" && team in 55..70 && food >= 50 && weather == "true")
        println("Корабль может отправляться в плавание!")
    else if (team >= 70 && food >= 50 && weather == "true")
        println("Повреждения не значительны, корабль может отправляться в плавание!")
    else println("Повреждения критические, корабль не может отправляться в плавание!")


}