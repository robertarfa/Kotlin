import java.util.*

fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortuneCookie(getBirthday())
        println("\nYour fortune is: $fortune")
//        if (fortune.contains("Take it easy")) break;
    }
}


fun getFortuneCookie(birthday: Int) : String {
    val listOfFortune = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

    val index = when(birthday){
        in 1..5 -> 0
        10, 12 -> 3
        20 -> 6
        else ->birthday.rem(listOfFortune.size)
    }
    return listOfFortune[index]


}

fun getBirthday(): Int {
    print("Enter your birthday:")

    return readLine()?.toIntOrNull() ?: 2
}

fun dayOfWeek(){
    println("What day is it today?")

    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    println( when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    })
}
