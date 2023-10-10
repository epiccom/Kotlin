package lesson_13

fun main() {
    try {
        println("Введите номер:")
        val number: Long
        val strNumber = readLine().toString()
        number = strNumber.toLong()
    } catch (e: Exception) {
        println("Номер может содержать только цифры")
    }
}