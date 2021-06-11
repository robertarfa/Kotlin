package classes

fun main(args: Array<String>) {

    getMoodFromUser()
}

fun whatShouldIDoToday(
    mood: String?,
    weather: String = "sunny",
    temperature: Int = 24
) {

    fun isHappyAndSunny(mood : String?, weather: String) = mood == "happy" && weather.uppercase() == "SUNNY"
    fun isSadAndRainyAndTemperatureZero(mood: String?, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0
    fun isTooHot(temperature: Int) = temperature > 35

    return println(when{
        isHappyAndSunny(mood, weather) -> "Go for a walk"
        isSadAndRainyAndTemperatureZero(mood, weather,temperature) -> "Stay in bed"
        isTooHot(temperature) -> "Go swimming"
        else -> "Stay home and read."
    })
}

fun getMoodFromUser() {
    println("How do you feel?")

     return whatShouldIDoToday(readLine())
}