package lesson_7

fun main () {
    println("Введите любое число:")
    val maxNum = readln().toInt()
    for (i in 0..maxNum step 2) println(i)
}