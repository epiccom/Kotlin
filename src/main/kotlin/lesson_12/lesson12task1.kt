package lesson_12

class InfoOfWeather() {
    var dayTemperature = "35°"
    var nightTemperature = "15°"
    var atmospherePressure = "764 мм рт.ст."

}
fun main() {
    val object1 = InfoOfWeather()
    object1.dayTemperature = "Температура днём 40°"
    object1.nightTemperature = "Температура ночью 17°"
    object1.atmospherePressure = "Атмосферное давление 764 мм рт. ст."
    println("${object1.dayTemperature}, ${object1.nightTemperature}, ${object1.atmospherePressure}")

    val object2 = InfoOfWeather()
    object2.dayTemperature = "Температура днём 10°"
    object2.nightTemperature = "Температура ночью -10°"
    object2.atmospherePressure = "Атмосферное давление 724 мм рт. ст."
    println("${object2.dayTemperature}, ${object2.nightTemperature}, ${object2.atmospherePressure}")
}