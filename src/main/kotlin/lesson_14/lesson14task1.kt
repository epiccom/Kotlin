package lesson_14

class StandardShip(
    val name: String,
    val speed: Byte,
    val carrying: Byte,
) {
    fun shipSpeed() {
        println("$name движется со скоростью $speed узлов")
    }

    fun amountOfCargoBoxes() {
        println("$name перевозит $carrying ящиков груза")
    }

}

fun main() {
    val standardShip = StandardShip("Стандартный корабль", 20, 15)

    standardShip.shipSpeed()
    standardShip.amountOfCargoBoxes()
}