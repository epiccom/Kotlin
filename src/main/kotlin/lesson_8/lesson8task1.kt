package lesson_8

fun main() {
    val views = arrayOf(10156, 11216, 13578, 9872, 10003, 12876, 6520)
    var sum = 0
    for (i in views) {
        sum += i
    }
    println("Сумма всех чисел: $sum")
}