import java.util.*

fun main(args: Array<String>) {
    println("Hello World =)")
//    println("${args[0]}")
   feedTheFish()
//    fitMoreFish(8.0, listOf(2,2,2), hasDecoration = false)
}

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Double = getDirtySensorReading()
) : Boolean{
    fun isTooHot(temperature: Int) = temperature > 30;
    fun isDirty(dirty: Double) = dirty > 30;
    fun isSunday(day: String) = day.uppercase() == "SUNDAY"

    return when{
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun getDirtySensorReading() = Math.random() * 1000

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")

    if(shouldChangeWater(day)){
        println("Change the water today!")
    }
}

fun randomDay(): String{
    val week = listOf ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day : String) : String{
//    var food = "fasting"

    return when(day){
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
//        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" ->  "lettuce"
//        "Sunday" -> "plankton"
        else -> "fasting"
    }

}

fun fitMoreFish(
    tankSize : Double,
    currentFish : List<Int>,
    fishSize: Int = 2,
    hasDecoration: Boolean = true
) : Boolean{
    var canAddFish = true

    if(((currentFish.sum() * fishSize) > (tankSize - 2)) && hasDecoration){
        canAddFish = false
    }

    if((currentFish.sum() * fishSize) <= (tankSize - 2) && !hasDecoration){
        canAddFish = false
    }

    println(canAddFish)
    return canAddFish
//    println(currentFish.sum())
//    return (tankSize * if (hasDecoration) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}