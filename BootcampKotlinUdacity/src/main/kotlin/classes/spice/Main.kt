package classes.spice

fun main(args: Array<String>) {

    // Creates instance of Curry and prints the color of the spice
    val curry = Curry("curry", "spicy")
    println("Curry has color ${curry.color}")
}

abstract class Spice(val spiceName: String, val spiciness: String = "mild",
                     color: SpiceColor = YellowSpiceColor) : SpiceColor by color {
    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) :
    Spice(name, spiciness, color), Grinder {
    override fun grind() {
    }

    override fun prepareSpice() {
        grind()
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}

enum class Color(val rgb: Int) {
    YELLOW(0xFFFF00),
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF);
}