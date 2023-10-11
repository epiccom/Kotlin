package lesson_14

open class StandardShip0(
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
class CargoShip(
    name: String,
    speed: Byte,
    carrying: Byte,
    val typeOfCargo: String,
) : StandardShip0(name,speed, carrying) {
    fun typeOfCargo() {
        println("$name перевозит $typeOfCargo")
    }
}
class IceBreaker(
    name: String,
    speed: Byte,
    carrying: Byte,
    val crushIce: Boolean,
) : StandardShip0(name, speed, carrying) {
    fun abilityToCrushIce() {
        if (crushIce) println("$name может проходить через льды")
        else println("$name не может проходить через льды")
    }
}

fun main() {
    val standardShip = StandardShip0("Стандартный корабль", 20, 15)
    standardShip.shipSpeed()
    standardShip.amountOfCargoBoxes()
    println()

    val cargoShip = CargoShip("Грузовой корабль",12,30, "гуманитарный груз")
    cargoShip.shipSpeed()
    cargoShip.amountOfCargoBoxes()
    cargoShip.typeOfCargo()
    println()

    val iceBreaker = IceBreaker("Ледокол",6,6,true)
    iceBreaker.shipSpeed()
    iceBreaker.amountOfCargoBoxes()
    iceBreaker.abilityToCrushIce()
}