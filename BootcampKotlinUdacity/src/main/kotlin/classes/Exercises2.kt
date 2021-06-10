package classes

fun main(args: Array<String>) {
    whatShouldIDoToday("happy")

}

fun whatShouldIDoToday(
    mood : String,
    weather : String = "sad",
    temperature : Int = 24
) {

    fun isHappyAndSunny(mood : String, weather: String) = mood == "happy" && weather.uppercase() == "SUNNY"
    fun isSadAndRainyAndTemperatureZero(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0
    fun isTooHot(temperature: Int) = temperature > 35

    return println(when{
        isHappyAndSunny(mood, weather) -> "Go for a walk"
        isSadAndRainyAndTemperatureZero(mood, weather,temperature) -> "Stay in bed"
        isTooHot(temperature) -> "Go swimming"
        else -> "Stay home and read."
    })
}