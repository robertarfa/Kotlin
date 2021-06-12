package aquarium

fun main(args: Array<String>) {
    buildAquarium()
}

private fun buildAquarium(){
    //same thing as new keyword
    // kotlin writes a get, even though we didn't do it
    val myAquarium = Aquarium()

    println("Length: ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.height}")

    myAquarium.height = 80
    println("Height: ${myAquarium.height} cm")

    println("Volume ${myAquarium.volume} liters")
}