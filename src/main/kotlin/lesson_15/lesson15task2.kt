package lesson_15

abstract class WeatherInformation {
    fun connectServer() {
        println("Подключение к серверу...")
    }

    abstract fun sendInformation()
}

class InfoOfTemperature(val temperature: Int) : WeatherInformation() {
    override fun sendInformation() {
        println("Температура воздуха $temperature°С")
    }
}

class InfoOfPrecipitation(val precipitation: Double) : WeatherInformation() {
    override fun sendInformation() {
        println("Количество осадков $precipitation мм")
    }
}

fun main() {
    val temp = InfoOfTemperature(16)
    val precipitation = InfoOfPrecipitation(0.1)

    temp.connectServer()
    temp.sendInformation()
    precipitation.connectServer()
    precipitation.sendInformation()
}