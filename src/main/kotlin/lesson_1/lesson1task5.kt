package lesson_1

fun main(){
    val seconds = 6480
    val minutes = seconds/60 //108
    val hours = minutes/60 //1.8
    val minutes1 = minutes%60//0,8
    val minutes2 = minutes1*60//48
    val seconds1: String = "00"
    println("0$hours:$minutes1:$seconds1")
}