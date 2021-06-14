package aquarium

import kotlin.math.PI


//declaring constructor with default values
//make the class open to enable the heritage, by default classes are not subclassible we have to allowed
open class Aquarium(
    var width: Int = 100,
    var height: Int = 20,
    var length: Int = 40
){
    open var volume : Int
    get() = width * height * length / 1000
    set(newVolume) {height = (newVolume * 1000) / (width * length)}

    open var water = volume * 0.9

    constructor(numberOfFish: Int): this(){
        val water: Int = numberOfFish * 2000 //cm3
        val tank: Double = water + water * 0.1
        height = (tank / (length * width)).toInt()
    }

//    fun volume() = width * height * length / 1000
}

class TowerTank() : Aquarium(){
    override var water = volume * 0.8

    override var volume : Int
        get() = (width * height * length / 1000 * PI).toInt()
        set(newVolume) {height = (newVolume * 1000) / (width * length)}
}