package lesson_15

interface Swimmable {
    fun swim() {
        println("может плавать")
    }
}

interface Flyable {
    fun fly() {
        println("может летать")
    }
}

class Crucian(val name: String) : Swimmable
class Gull(val name: String) : Flyable
class Duck(val name: String) : Swimmable, Flyable

fun main() {
    val crucian = Crucian("Карась")
    val gull = Gull("Чайка")
    val duck = Duck("Утка")

    print("${crucian.name} ")
    crucian.swim()
    print("${gull.name} ")
    gull.fly()
    print("${duck.name} ")
    duck.swim()
    print("и ")
    duck.fly()

}