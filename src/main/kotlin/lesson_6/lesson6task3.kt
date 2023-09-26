package lesson_6

fun main() {
    println("Введите кол-во секунд для запуска таймера:")
    var seconds = readln().toLong()
    while (seconds > 0) {
        println("Осталось секунд: ${seconds--}")
        Thread.sleep(1000)
    }
    println("Время вышло")
}