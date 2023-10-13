package lesson_14

open class CelestialBody(
    val name: String,
    val galaxy: String,
)

class Planet(
    name: String,
    galaxy: String,
    val habitability: Boolean,
    val availabilityOfAtmosphere: Boolean,
    val availabilityOfWater: Boolean,
    val availabilityOfLanding: Boolean,
    val satellites: MutableList<Satellite>,
) : CelestialBody(name, galaxy)

class Satellite(
    name: String,
    galaxy: String,
    val habitability: Boolean,
    val availabilityOfAtmosphere: Boolean,
    val availabilityOfWater: Boolean,
    val availabilityOfLanding: Boolean,
) : CelestialBody(name, galaxy)

fun main() {
    val carina = Satellite("Carina","Tucana", false,true,false,true,)
    val pictor = Satellite("Pictor", "Tucana", true, true, true, true,)
    val hydrus = Planet("Hydrus","Tucana", true,false,false,true, mutableListOf(carina, pictor))
    println("Имя планеты: ${hydrus.name}")
    println("Спутники планеты ${hydrus.name}: ${carina.name}, ${pictor.name}")
}