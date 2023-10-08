package lesson_12

class InfoOfWeather3(var dayT: Int, var nightT: Int, var rain: Int, var atPr: Int) {
    init {
        println(
            "Температура днём: $dayT°, температура ночью: $nightT°," +
                    " был ли дождь: ${if (rain == 1) "да" else "нет"}, атмосферное давление: $atPr мм рт. ст."
        )
    }
}

fun main() {
    val listOfWeather: MutableList<InfoOfWeather3> = mutableListOf()
    val listOfTempDay: MutableList<Int> = mutableListOf()
    val listOfTempNight: MutableList<Int> = mutableListOf()
    val listOfRain: MutableList<Int> = mutableListOf()
    val listOfAtmosPr: MutableList<Int> = mutableListOf()

    var i = 0
    while (i < 10) {
        val tempDay = (17..45).random()
        val tempNight = (-17..16).random()
        val rain = (0..1).random()
        val atmosPr = (720..790).random()
        listOfWeather.add(InfoOfWeather3(tempDay, tempNight, rain, atmosPr))
        i += 1
    }

    listOfWeather.forEach {
        listOfTempDay.add(it.dayT)
        listOfTempNight.add(it.nightT)
        listOfRain.add(it.rain)
        listOfAtmosPr.add(it.atPr)
    }

    val averageTempDay = listOfTempDay.average().toInt()
    val averageTempNight = listOfTempNight.average().toInt()
    val averageAtmosPr = listOfAtmosPr.average().toInt()
    val rainDays = listOfRain.count{it > 0}

    println("Средняя дневная температура: $averageTempDay°")
    println("Средняя ночная температура: $averageTempNight°")
    println("Среднее атмосферное давление: $averageAtmosPr мм рт. ст.")
    println("Количество дождливых дней: $rainDays")
}
