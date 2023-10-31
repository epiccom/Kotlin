package lesson_18

class CRMSystem {
    fun orderInformation(
        number: Int,
        order: String,
    ) {
        println("Заказан товар: $order")
    }

    fun orderInformation(
        number: Int,
        order: List<String>,
    ) {
        println("Заказаны следующие товары: $order")
    }
}

fun main() {
    val order = CRMSystem()
    order.orderInformation(1, "Заказ №1")
    order.orderInformation(2, listOf("Заказ №2", "Заказ №3"))
}