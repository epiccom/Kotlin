package lesson_12

class InfoOfWeather1(var dayT: Int, var nightT: Int, var rain: Boolean = true, var atPr: Int)

fun main() {
    val object1 = InfoOfWeather1(20,5,true,766)
    println("Температура днём: ${object1.dayT}°, температура ночью: ${object1.nightT}°," +
            " был ли дождь: ${object1.rain}, атмосферное давление: ${object1.atPr} мм рт. ст.")

    val object2 = InfoOfWeather1(40,15,false,745)
    println("Температура днём: ${object2.dayT}°, температура ночью: ${object2.nightT}°," +
            " был ли дождь: ${object2.rain}, атмосферное давление: ${object2.atPr} мм рт. ст.")

    val object3 = InfoOfWeather1(10,-5,true,738)
    println("Температура днём: ${object3.dayT}°, температура ночью: ${object3.nightT}°," +
            " был ли дождь: ${object3.rain}, атмосферное давление: ${object3.atPr} мм рт. ст.")
}