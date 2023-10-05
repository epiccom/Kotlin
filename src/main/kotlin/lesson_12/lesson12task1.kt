package lesson_12

class InfoOfWeather() {
    var dayTemperature = 35
    var nightTemperature = 15
    var rain = true
    var atmospherePressure = 764

}
fun main() {
    val object1 = InfoOfWeather()
    object1.dayTemperature = 40
    object1.nightTemperature = 17
    object1.rain = false
    object1.atmospherePressure = 764
    println("Температура днём: ${object1.dayTemperature}°, температура ночью: ${object1.nightTemperature}°," +
            "был ли дождь: ${object1.rain}, атмосферное давление: ${object1.atmospherePressure} мм рт. ст.")

    val object2 = InfoOfWeather()
    object2.dayTemperature = 10
    object2.nightTemperature = -10
    object2.rain = true
    object2.atmospherePressure = 724
    println("Температура днём: ${object2.dayTemperature}°, температура ночью: ${object2.nightTemperature}°," +
            "был ли дождь: ${object2.rain}, атмосферное давление: ${object2.atmospherePressure} мм рт. ст.")
}