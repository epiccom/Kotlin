package lesson_17

class Package() {
    var name = "Папка"
        get() = if (flag) "Скрытая папка" else field
    var files: Int = 5
        get() = if (flag) 0 else field
    var flag = false
}

fun main() {
    val pack = Package()
    pack.name = "Новая папка"
    pack.flag = true
    println(pack.name)
    println(pack.files)

}