package lesson_4

fun main() {
    println(
        """
    Введите данные в формате:[Повреждения(да/нет),Экипаж,Провизия,Погода благоприятна(да/нет)]
    Пример вводных данных: [да,50,45,нет]
    """.trimIndent()
    )
    val input = readln()
    val result = input.split(",")
    val isDamaged = (result[0] == "нет")
    val team = result[1].toInt()
    val food = result[2].toInt()
    val weather = (result[3] == "да")

    if (isDamaged == true && team in TEAM_MIN..TEAM_MAX && food >= FOOD_MIN && weather == true)
        println("Корабль может отправляться в плавание!")
    else if (team >= TEAM_MAX && food >= FOOD_MIN && weather == true)
        println("Повреждения не значительны, корабль может отправляться в плавание!")
    else println("Повреждения критические, корабль не может отправляться в плавание!")

}

const val TEAM_MIN = 55
const val TEAM_MAX = 70
const val FOOD_MIN = 50