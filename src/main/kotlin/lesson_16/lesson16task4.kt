package lesson_16

class Order(val number: Int, var status: Boolean) {
    private fun orderReady(ready: Boolean) {
        status = ready
    }

    fun changeStatus(ready: Boolean) {
        orderReady(ready)
    }

}

fun main() {
    val order = Order(1, false)
    println("Статус заказа №${order.number}: ${order.status}")
    order.changeStatus(true)
    println("Статус заказа №${order.number}: ${order.status}")
}