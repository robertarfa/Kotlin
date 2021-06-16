package classes.spice

fun main() {
    for(element in spiceCabinet) println(element.label)
}

data class SpiceContainer(var spice: Spice){
    val label = spice.spiceName
}

val spiceCabinet = listOf(
    SpiceContainer(Curry("Yellow Curry", "mild")),
    SpiceContainer(Curry("Red Curry", "medium")),
    SpiceContainer(Curry("Green Curry", "spicy"))
)

