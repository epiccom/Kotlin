package lesson_2

fun main() {
    val rab = 50
    val zpRab = 30000
    val intern = 30
    val zpIntern = 20000

    val totalZpRab = rab*zpRab
    val totalZpIntern = intern*zpIntern
    val totalZp = totalZpRab+totalZpIntern
    val average = totalZp/(rab+intern)

    println("Расходы на выплату постоянным работникам: $totalZpRab")
    println("Общие расходы после прихода стажеров: $totalZp")
    println("Средняя зарплата сотрудника: $average")
}