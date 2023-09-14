package lesson_3

fun main() {
    var move = "D2-D4;0"

    println(move)

    val from = "D2"
    val where = "D4"
    val num = 0

    move = "$from-$where;$num"

    println(move)
}