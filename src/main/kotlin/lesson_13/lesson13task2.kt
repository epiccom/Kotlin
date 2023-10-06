package lesson_13

class Contact0(val name: String, val number: Long, val company: String?){
    init {
        println("Имя: $name\nНомер: $number\nКомпания: ${company ?: "[не указано]"}")
    }
}
fun main() {
    val contact = Contact0("Ростислав", 89686142284, null)
}