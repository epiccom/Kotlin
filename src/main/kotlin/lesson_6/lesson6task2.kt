package lesson_6

fun main() {
    println("Введите кол-во секунд для запуска таймера:")
    val seconds = readln().toLong()
    val toMills = seconds * 1000
    Thread.sleep(toMills)
    println("Прошло $seconds секунд")
}