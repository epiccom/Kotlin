package lesson_12

class InfoOfWeather0(dayT: Int, nightT: Int, atPr: Int) {
    var dayTemperature = dayT
    var nightTemperature = nightT
    var atmospherePressure = atPr

}

fun main() {
    val object1 = InfoOfWeather0(40, 17, 764)
    println(
        "Температура днём: ${object1.dayTemperature}°, температура ночью: ${object1.nightTemperature}°," +
                " атмосферное давление: ${object1.atmospherePressure} мм рт. ст."
    )

    val object2 = InfoOfWeather0(10, -10, 724)
    println(
        "Температура днём: ${object2.dayTemperature}°, температура ночью: ${object2.nightTemperature}°," +
                " атмосферное давление: ${object2.atmospherePressure} мм рт. ст."
    )

    val object3 = InfoOfWeather0(20, 0, 753)
    println(
        "Температура днём: ${object3.dayTemperature}°, температура ночью: ${object3.nightTemperature}°," +
                " атмосферное давление: ${object3.atmospherePressure} мм рт. ст."
    )
}