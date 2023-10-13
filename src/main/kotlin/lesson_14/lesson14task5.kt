package lesson_14

import kotlin.math.PI
import kotlin.math.sqrt

abstract class Figure(val color: String) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(color: String, val radius: Int) : Figure(color) {
    override fun calculateArea(): Double {
        return PI * (radius * radius)
    }

    override fun calculatePerimeter(): Double {
        return 2 * PI * radius
    }
}

class Rectangle(color: String, val height: Int, val width: Int) : Figure(color) {
    override fun calculateArea(): Double {
        return (height * width).toDouble()

    }

    override fun calculatePerimeter(): Double {
        return (2 * (height + width)).toDouble()
    }

}

class Triangle(color: String, val lengthA: Int, val lengthB: Int, val lengthC: Int) : Figure(color) {
    override fun calculateArea(): Double {
        val p = ((lengthA + lengthB + lengthC) / 2).toDouble()
        return sqrt((p * (p - lengthA) * (p - lengthB) * (p - lengthC)))
    }

    override fun calculatePerimeter(): Double {
        return (lengthA + lengthB + lengthC).toDouble()
    }

}

fun sumPerimetersOfRedFigures(array: Array<Figure>): Double {
    var summa = 0.0
    array.forEach {
        if (it.color == "red") summa += it.calculatePerimeter()
    }
    return summa
}

fun sumAreaOfRedFigures(array: Array<Figure>): Double {
    var summa = 0.0
    array.forEach {
        if (it.color == "red") summa += it.calculateArea()
    }
    return summa
}

fun main() {
    val circle1 = Circle("red", 6)
    val circle2 = Circle("black", 11)

    val rectangle1 = Rectangle("green", 13, 8)
    val rectangle2 = Rectangle("red", 23, 15)

    val triangle1 = Triangle("black", 5, 6, 7)
    val triangle2 = Triangle("green", 10, 10, 12)

    val figures: Array<Figure> = arrayOf(circle1, circle2, rectangle1, rectangle2, triangle1, triangle2)
    println("Сумма периметров красных фигур: ${sumPerimetersOfRedFigures(figures)}")
    println("Сумма площадей красных фигур: ${sumAreaOfRedFigures(figures)}")
}