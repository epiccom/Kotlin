package lesson_13

class Contact1(val name: String?, val number: Long?, val company: String?)

fun main () {
    val contacts: MutableList<Contact1> = mutableListOf()

    val contact0 = Contact1("Пётр",89125672341,"Google")
    val contact1 = Contact1("Василий",89995001212,"Apple")
    val contact2 = Contact1(null,88888888888,"Amazon")
    val contact3 = Contact1("Аркадий",null,"Tesla")
    val contact4 = Contact1("Иннокентий",88001001010,null)

    contacts.add(contact0)
    contacts.add(contact1)
    contacts.add(contact2)
    contacts.add(contact3)
    contacts.add(contact4)

    contacts.forEach {
        println("Имя: ${it.name ?:"[не указано]"}\nНомер: ${it.number ?: "[не указано]"}\n" +
                "Компания: ${it.company ?: "[не указано]"}")
    }

}

