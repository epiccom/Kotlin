package lesson_2

fun main() {
    val hours = 9
    val minutes = 39
    val wayTime = 457

    val minTotal = hours * 60 + minutes + wayTime
    val hoursTotal = minTotal / 60.0
    val timeHours = minTotal / 60
    val minutesTotal = hoursTotal % timeHours
    val timeMinutes = minutesTotal * 60

    println("Время прибытия поезда: $timeHours:${timeMinutes.toInt()}")

}