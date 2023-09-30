package lesson_10

fun main() {
    roundOfDice()
    askForRound()
}

var humanWin = 0
fun askForRound() {
    println("Хотите бросить кости еще раз Введите Да или Нет")
    if (readln().equals("да", true)) {
        roundOfDice()
        return askForRound()
    } else {
        println("Человек выиграл $humanWin раз(а)")
    }
}

fun roundOfDice() {

    val human = rolledDice()
    println("Игроку выпало: $human")

    val comp = rolledDice()
    println("Компьютеру выпало: $comp")

    if (human > comp) {
        println("Выиграло человечество!")
        humanWin += 1
    } else {
        println("Выиграли машины!")
    }
}

fun rolledDice(): Int {
    val dice1 = (1..6).random()
    val dice2 = (1..6).random()
    return dice1 + dice2
}
