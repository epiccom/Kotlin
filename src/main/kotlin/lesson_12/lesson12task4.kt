package lesson_12

class InfoOfWeather2(var dayT: Int, var nightT: Int, var rain: Boolean = true, var atPr: Int) {
    init {
        println(
            "Температура днём: $dayT°, температура ночью: $nightT°," +
                    " был ли дождь: $rain, атмосферное давление: $atPr мм рт. ст."
        )
    }
}

fun main() {
    val object1 = InfoOfWeather2(20, 5, true, 746)
    val object2 = InfoOfWeather2(15, -5, false, 756)
    val object3 = InfoOfWeather2(40, 15, true, 776)
}