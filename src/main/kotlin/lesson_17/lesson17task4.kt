package lesson_17

class Package0(val number: Int, location: String,) {
    var location = location
        set(value) {
            field = value
            movements += 1
        }
    var movements = 0
}

fun main() {
    val pack0 = Package0(1,"base")
    println(pack0.movements)
    pack0.location = "in transit"
    println(pack0.movements)
}