package lesson_7

fun main() {
    println("Введите кол-во секунд, которые нужно засечь")
    val maxNum = readln().toInt()
    for (i in maxNum downTo 0) {
        println(i)
        Thread.sleep(1000)
    }
    println("Время вышло")
}