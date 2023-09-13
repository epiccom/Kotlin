package lesson_2

fun main() {
    val vklad = 70000
    val stavka = 16.7 // 16,7% годовых

    println(vklad*(1 + stavka / 100) * 20) // 1633800.0
}