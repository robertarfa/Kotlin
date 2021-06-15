package aquarium

abstract class AquariumFish {
    abstract val color: String
}
// abstract classes can have constructor and intefaces can not.
class Shark: AquariumFish(), FishAction{
    override val color = "gray"

    override fun eat(){
        println("hunt and eat fish")
    }
}

class Plecostomus: AquariumFish(), FishAction{
    override val color = "gold"

    override fun eat(){
        println("Much on algae")
    }
}

interface FishAction{
    fun eat()
}