package lesson_3

fun main() {
    val moveTotal = "D2-D4;0"
    val sym = "-"
    val sym1 = ";"

    val result = moveTotal.split(sym, sym1)
    val move = result[2]
    val where = result[1]
    val from = result[0]

    println(
        """
    $from,
    $where,
    $move.
    """.trimIndent()
    )
}