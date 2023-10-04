package lesson_12

class InfoOfWeather() {
    var dayTemperature = 35
    var nightTemperature = 15
    var atmospherePressure = 764

}
fun main() {
    val object1 = InfoOfWeather()
    object1.dayTemperature = 40
    object1.nightTemperature = 17
    object1.atmospherePressure = 764
    println("Температура днём: ${object1.dayTemperature}°, температура ночью: ${object1.nightTemperature}°," +
            " атмосферное давление: ${object1.atmospherePressure} мм рт. ст.")

    val object2 = InfoOfWeather()
    object2.dayTemperature = 10
    object2.nightTemperature = -10
    object2.atmospherePressure = 724
    println("Температура днём: ${object2.dayTemperature}°, температура ночью: ${object2.nightTemperature}°," +
            " атмосферное давление: ${object2.atmospherePressure} мм рт. ст.")
}