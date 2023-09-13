package lesson_1

fun main() {

    val totalSeconds = 6480

    val totalMinutes = totalSeconds / 60 //108
    val hours = totalMinutes / 60 //1
    val minutes = totalMinutes % 60 //48
    val seconds = totalSeconds % 60

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}