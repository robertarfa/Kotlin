package aquarium

fun main(args: Array<String>) {
    buildAquarium()
    makeFish()
}

private fun buildAquarium(){
    //same thing as new keyword
    // kotlin writes a get, even though we didn't do it
//    val myAquarium = Aquarium()

//    println("myAquarium -> Length: ${myAquarium.length} " +
//            "Width: ${myAquarium.width} " +
//            "Height: ${myAquarium.height}")
//    println("Volume myAquarium ${myAquarium.volume} liters")

//    myAquarium.height = 80
//    println("myAquarium newHeight: ${myAquarium.height} cm")
//    println("Volume with newHeight myAquarium ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(width = 15,height = 30,length = 12)
    println("smallAquarium based on aquarium size -> Length: ${smallAquarium.length} " +
            "Width: ${smallAquarium.width} " +
            "Height: ${smallAquarium.height}")
    println("Volume smallAquarium ${smallAquarium.volume} liters")

    val myAquarium2 = Aquarium(numberOfFish = 9)
    println("smallAquarium2 based on the number of fish -> Length: ${myAquarium2.length} " +
            "Width: ${myAquarium2.width} " +
            "Height: ${myAquarium2.height}")
    println("Volume smallAquarium2 ${myAquarium2.volume} liters")
}

fun feedFish(fish: FishAction){
    fish.eat()
}

fun makeFish(){
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color} Plecostomus: ${pleco.color}")

    shark.eat()
    pleco.eat()
}

