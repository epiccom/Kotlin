package lesson_4

fun main() {
    var weight = 20
    var volume = 80

    println(
        "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average':" +
        "${(weight >= WEIGHT_MIN && weight <= WEIGHT_AND_VOLUME_MAX) && (volume <= WEIGHT_AND_VOLUME_MAX)}"
    )

    weight = 50
    volume = 100

    println(
        "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average':" +
        "${(weight >= WEIGHT_MIN && weight <= WEIGHT_AND_VOLUME_MAX) && (volume <= WEIGHT_AND_VOLUME_MAX)}"
    )
}

const val WEIGHT_MIN = 35
const val WEIGHT_AND_VOLUME_MAX = 100
