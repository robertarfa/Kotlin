import java.util.*

fun main(args: Array<String>) {
    println("Hello World =)")
//    println("${args[0]}")
    feedTheFish()

}

fun feedTheFish(){
    val day = randonDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun randonDay(): String{
    val week = listOf ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day : String) : String{
    var food = "fasting"

    return when(day){
        "Monday" -> "flakes"
        "Tuesday" -> "pelles"
        "Wednesday" -> "redworms"
//        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" ->  "lettuce"
//        "Sunday" -> "plankton"
        else -> "fasting"
    }

}