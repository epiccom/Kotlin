package lesson_15

class Instrument(val name: String, val amount: Int) : SearchComponent

class Component(val name: String, val instrument: String, val amount: Int)

interface SearchComponent {
    fun searchComponent() {
        println("Выполняется поиск")
    }
}
fun main() {
    val guitar = Instrument("Гитара", 10)
    guitar.searchComponent()
}