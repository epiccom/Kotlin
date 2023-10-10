package lesson_14

class StandardShip(
    val name: String,
    val speed: Byte,
    val carrying: Byte,
    val crushIce: Boolean = false,
) {
    fun shipSpeed() {
        println("$name движется со скоростью $speed узлов")
    }

    fun amountOfCargoBoxes() {
        println("$name перевозит $carrying ящиков груза")
    }

    fun abilityToCrushIce() {
        if (crushIce) println("$name может проходить через льды")
        else println("$name не может проходить через льды")
    }
}

fun main() {
    val standardShip = StandardShip("Стандартный корабль", 20, 15)
    val cargoShip = StandardShip("Грузовой корабль", 12, 30)
    val iceBreaker = StandardShip("Ледокол", 6, 6, true)

    standardShip.shipSpeed()
    standardShip.amountOfCargoBoxes()
    standardShip.abilityToCrushIce()
    println()

    cargoShip.shipSpeed()
    cargoShip.amountOfCargoBoxes()
    cargoShip.abilityToCrushIce()
    println()

    iceBreaker.shipSpeed()
    iceBreaker.amountOfCargoBoxes()
    iceBreaker.abilityToCrushIce()


}