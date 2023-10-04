package lesson_12

class InfoOfWeather0(dayT: Int, nightT: Int, rain: Boolean, atPr: Int) {
    var dayTemperature = dayT
    var nightTemperature = nightT
    var rain = rain
    var atmospherePressure = atPr

}

fun main() {
    val object1 = InfoOfWeather0(40, 17, false, 764)
    println(
        "Температура днём: ${object1.dayTemperature}°, температура ночью: ${object1.nightTemperature}°," +
                "был ли дождь: ${object1.rain}, атмосферное давление: ${object1.atmospherePressure} мм рт. ст."
    )

    val object2 = InfoOfWeather0(10, -10,true, 724)
    println(
        "Температура днём: ${object2.dayTemperature}°, температура ночью: ${object2.nightTemperature}°," +
                "был ли дождь: ${object2.rain}, атмосферное давление: ${object2.atmospherePressure} мм рт. ст."
    )

    val object3 = InfoOfWeather0(20, 0,false , 753)
    println(
        "Температура днём: ${object3.dayTemperature}°, температура ночью: ${object3.nightTemperature}°," +
                "был ли дождь: ${object3.rain} атмосферное давление: ${object3.atmospherePressure} мм рт. ст."
    )
}