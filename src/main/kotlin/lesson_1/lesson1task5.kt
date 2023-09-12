package lesson_1

fun main() {

    val totalSeconds = 6480

    val minutes = totalSeconds / 60 //108
    val hours = minutes / 60 //1
    val minutes1 = minutes % 60 //48

    //return String.format("%02d:%02d:00", hours, minutes1)
    println("0$hours:$minutes1:00")
}