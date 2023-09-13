package lesson_2

fun main() {
    val crystal = 7
    val iron = 11

    val bCrystal = crystal * 0.20
    val bIron = iron * 0.20

    println("Кристаллов добыто: $crystal, 20% бафф: ${bCrystal.toInt()}")
    println("Железа добыто: $iron, 20% бафф: ${bIron.toInt()}")
}