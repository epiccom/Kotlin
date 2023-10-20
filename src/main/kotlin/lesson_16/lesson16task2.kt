package lesson_16

private const val PI = 3.14

class Circle(private val r: Int) {
    fun calculateCircleLength() {
        println("Длина окружности равна: ${2 * PI * r}")
    }

    fun calculateCircleArea() {
        println("Площадь окружности равна: ${PI * (r * r)}")
    }
}


fun main() {
    val circle = Circle(6)
    circle.calculateCircleLength()
    circle.calculateCircleArea()
}