package lesson_17

class Package(name: String, files: Int, private var isSecret: Boolean) {
    var name = name
        get() = if (isSecret) "Скрытая папка" else field
    var files = files
        get() = if (isSecret) 0 else field

}

fun main() {
    val pack = Package("Папка", 5, true)
    println("Имя папки: ${pack.name}, кол-во файлов: ${pack.files}")
}