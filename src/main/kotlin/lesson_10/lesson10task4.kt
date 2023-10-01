package lesson_10

fun main() {
    startRoundOfDice()
    askForRound()
}

var humanWin = 0
fun askForRound() {
    println("Хотите бросить кости еще раз Введите Да или Нет")
    if (readln().equals("да", true)) {
        startRoundOfDice()
        return askForRound()
    } else {
        println("Человек выиграл $humanWin раз(а)")
    }
}

fun startRoundOfDice() {

    val human = rollDice()
    println("Игроку выпало: $human")

    val comp = rollDice()
    println("Компьютеру выпало: $comp")

    if (human > comp) {
        println("Выиграло человечество!")
        humanWin += 1
    } else {
        println("Выиграли машины!")
    }
}

fun rollDice(): Int {
    val dice1 = (1..6).random()
    val dice2 = (1..6).random()
    return dice1 + dice2
}
