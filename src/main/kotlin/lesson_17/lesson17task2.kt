package lesson_17

class Ship() {
    var name = "Корабль 1"
        set(value) {
            println("Имя коробля нельзя менять")
        }
    var averageSpeed = 15
    var homePort = "Port 1"
}

fun main() {
    val ship = Ship()
    ship.name = "Корабль 2"
    println(ship.name)
}