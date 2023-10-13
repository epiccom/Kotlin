package lesson_13

fun main() {
    try {
        println("Введите номер:")
        val number: Long
        val strNumber = readlnOrNull()
        number = strNumber!!.toLong()
    } catch (e: Exception) {
        println("Номер может содержать только цифры")
    }
}