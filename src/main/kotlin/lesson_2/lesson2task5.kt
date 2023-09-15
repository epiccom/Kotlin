package lesson_2

import kotlin.math.pow

fun main() {
    val vklad = 70000
    val stavka = 16.7

    val result = vklad * (1 + stavka / 100).pow(20)

    println(String.format("%.3f", result))
}