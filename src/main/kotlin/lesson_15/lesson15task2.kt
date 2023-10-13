package lesson_15

abstract class WeatherInformation {
    fun connectServer() {
        println("Подключение к серверу...")
    }

    abstract fun sendInformation()
}

class InfoOfTemperature() : WeatherInformation() {
    override fun sendInformation() {
        println("Температура воздуха +16°С")
    }
}

class InfoOfPrecipitation() : WeatherInformation() {
    override fun sendInformation() {
        println("Количество осадков 0.1 мм")
    }
}

fun main() {
    val temp = InfoOfTemperature()
    val precipitation = InfoOfPrecipitation()

    temp.connectServer()
    temp.sendInformation()
    precipitation.connectServer()
    precipitation.sendInformation()
}