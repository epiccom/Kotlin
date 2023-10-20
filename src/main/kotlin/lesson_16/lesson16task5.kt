package lesson_16

class Player(val name: String, private var health: Int, private var power: Int) {
    fun takingDamage(damage: Int) {
        if (health == 0 || health < 0) {
            death()
        } else {
            health -= damage
            println("Игрок получил $damage урона")
        }
    }

    fun healing() {
        if (health > 0) {
            health += 1
            println("+1 к здоровью")
        } else {
            println("Нельзя лечиться когда ты уже умер")
        }
    }

    private fun death() {
        health = 0
        power = 0
        println("Игрок умер")
    }
}

fun main() {
    val player = Player("Player 1", 5, 2)
    player.takingDamage(3)
    player.healing()
    player.takingDamage(2)
    player.takingDamage(2)
    player.takingDamage(2)
    player.healing()
}