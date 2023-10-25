package lesson_17

class Package0() {
    val number = 0
    var location = "base"
        set(value) {
            field = value
            movements += 1
        }
    var movements = 0
}
fun main() {
    val pack0 = Package0()
    println(pack0.location)
    println(pack0.movements)
    pack0.location = "in transit"
    println(pack0.movements)
}