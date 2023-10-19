package lesson_15

interface Transportable {
    fun cargoAndPassengers(name: String, cargo: Int, passengers: Int) {
        println("$name перевез $cargo тонны груза и $passengers пассажира(ов)")
    }

    fun passenger(name: String, amount: Int) {
        println("$name перевез $amount пассажиров")
    }
}

class CargoCar(val name: String) : Transportable {
    override fun cargoAndPassengers(name: String, cargo: Int, passengers: Int) {
        if (passengers > 1 || cargo > 2) println("$name может перевозить не более 2 тонн груза и 1 пассажира")
        else println("$name перевез $cargo тонны груза и $passengers пассажира(ов)")
    }
}
class PassengerCar(val name: String) : Transportable {
    override fun passenger(name: String, amount: Int) {
        if (amount > 3) println("$name может перевозить не более 3 пассажиров")
        else println("$name перевез $amount пассажиров")
    }
}

fun main() {
    val car1 = CargoCar("Грузовик")
    val car2 = PassengerCar("Легковой автомобиль")
    car1.cargoAndPassengers(car1.name, 2, 1)
    car2.passenger(car2.name, 3)
    car2.passenger(car2.name, 2)
}