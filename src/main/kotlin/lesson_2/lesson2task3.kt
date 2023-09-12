package lesson_2

fun main() {
    val hours = 9
    val minutes = 39
    val wayTime = 457

    val minTotal = hours * 60 + minutes + wayTime
    val hoursTotal = minTotal / 60.0 //17.266666666666666
    val timeHours = minTotal / 60 //17
    val minutesTotal = hoursTotal % timeHours // 0.266666666666666
    val timeMinutes = minutesTotal * 60 // 15 (.toInt)

    val Result = "$timeHours:${timeMinutes.toInt()}" // 17:15
    println("Время прибытия поезда: $Result")

}