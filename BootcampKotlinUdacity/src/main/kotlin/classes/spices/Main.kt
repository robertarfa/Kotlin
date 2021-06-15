package classes.spices

fun main(args: Array<String>){
//    val mySimpleSpice = SimpleSpice()
//    println("Spice Name: ${mySimpleSpice.name}")
//    println("Spice Heat: ${mySimpleSpice.heat}")

    // Creates new spice object
    val newSpice = Spice("cayenne", spiciness = "spicy")

    // List of spices
    val spiceList  = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy"),
        makeSalt()
    )

    // Filters all spices having spiciness level less than 5
    val filteredSpiceList = spiceList.filter { it.heat < 5 }

    println("filteredSpiceList :- $filteredSpiceList")
}

fun makeSalt() = Spice("Salt")