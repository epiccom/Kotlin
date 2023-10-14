package lesson_15

interface Transportable {
    fun cargoAndPassengers(name: String, cargo: Int, passengers: Int) {
        println("$name перевез $cargo тонны груза и $passengers пассажира(ов)")
    }

    fun passenger(name: String, amount: Int) {
        println("$name перевез $amount пассажиров")
    }
}

class CargoCar(val name: String) : Transportable
class PassengerCar(val name: String) : Transportable

fun main() {
    val car1 = CargoCar("Грузовик")
    val car2 = PassengerCar("Легковой автомобиль")
    car1.cargoAndPassengers(car1.name, 2, 1)
    car2.passenger(car2.name, 3)
    car2.passenger(car2.name, 2)
}