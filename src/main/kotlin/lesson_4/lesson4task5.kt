package lesson_4

fun main() {
    val totalMove = "D2-D4;0"
    val sym = "-"
    val sym1 = ";"

    val list = totalMove.split(sym, sym1)

    val from = list[0]
    val where = list[1]
    val move = list[2]

    println(
        """
        $from,
        $where,
        $move.
    """.trimIndent()
    )
}