package lesson_12

import kotlin.random.Random

class InfoOfWeather3(var dayT: Int, var nightT: Int, var rain: Boolean = true, var atPr: Int) {
    init {
        println(
            "Температура днём: $dayT°, температура ночью: $nightT°," +
                    " был ли дождь: $rain, атмосферное давление: $atPr мм рт. ст."
        )
    }
}

fun main() {
    val listOfWeather: MutableList<InfoOfWeather3> = mutableListOf()
    val listOfTempDay: MutableList<Int> = mutableListOf()
    val listOfTempNight: MutableList<Int> = mutableListOf()
    val listOfRain: MutableList<Boolean> = mutableListOf()
    val listOfAtmosPr: MutableList<Int> = mutableListOf()

    val averageTempDay = listOfTempDay.average()
    val averageTempNight = listOfTempNight.average()
    val averageAtmosPr = listOfAtmosPr.average()
    val rainDays = listOfRain.count()

    var i = 1
    while (i < 10) {
        val tempDay = (17..45).random()
        val tempNight = (-17..16).random()
        val rain = Random.nextBoolean()
        val atmosPr = (720..790).random()
        listOfWeather.add(InfoOfWeather3(tempDay, tempNight, rain, atmosPr))
        listOfTempDay.add(tempDay)
        listOfTempNight.add(tempNight)
        listOfRain.add(rain)
        listOfAtmosPr.add(atmosPr)
        i += 1
    }
    println("Средняя дневная температура: $averageTempDay°")
    println("Средняя ночная температура: $averageTempNight°")
    println("Среднее атмосферное давление: $averageAtmosPr мм. рт. ст.")
}
