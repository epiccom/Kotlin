package lesson_13

class Contact2(val name: String?, val number: String?, val company: String?)

val contacts: MutableList<Contact2> = mutableListOf()
fun addContact() {
    println("Введите имя:")
    var userName: String? = readln()
    if (userName != null) {
        if (userName.isEmpty()) userName = null
    }

    println("Введите номер:")
    val userNumber = readln()

    println("Введите компанию:")
    var userCompany: String? = readln()
    if (userCompany != null) {
        if (userCompany.isEmpty()) userCompany = null
    }

    if (userNumber == "") {
        println("Поле с номером не может быть пустым, повторите ввод")
        return addContact()
    } else {
        contacts.add(Contact2(userName, userNumber, userCompany))
        println("Контакт добавлен")
        println("Если хотите добавить новую запись, введите \"да\"")
        val answer = readln()
        if (answer.equals("да", ignoreCase = true)) return addContact() else return
    }
}

fun main() {
    addContact()
    contacts.forEach {
        println("Имя: ${it.name}\nНомер: ${it.number}\nКомпания: ${it.company}")
    }
}