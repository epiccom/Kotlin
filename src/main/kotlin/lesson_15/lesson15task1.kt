package lesson_15

interface MovableCrucian {
    fun swim() {
        println("Карась может плавать")
    }
}

interface MovableGull {
    fun fly() {
        println("Чайка может летать")
    }
}

interface MovableDuck {
    fun flyAndSwim() {
        println("Утка может летать и плавать")
    }
}

class Crucian(val name: String) : MovableCrucian
class Gull(val name: String) : MovableGull
class Duck(val name: String) : MovableDuck

fun main() {
    val crucian = Crucian("Карась")
    val gull = Gull("Чайка")
    val duck = Duck("Утка")

    crucian.swim()
    gull.fly()
    duck.flyAndSwim()

}