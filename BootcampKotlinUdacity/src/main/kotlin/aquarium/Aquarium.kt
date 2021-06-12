package aquarium

import kotlin.math.tan

//declaring constructor with default values
class Aquarium(
    var width: Int = 100,
    var height: Int = 20,
    var length: Int = 40
){
    var volume : Int
    get() = width * height * length / 1000
    set(newVolume) {height = (newVolume * 1000) / (width * length)}

    var water = volume * 0.9

    constructor(numberOfFish: Int): this(){
        val water: Int = numberOfFish * 2000 //cm3
        val tank: Double = water + water * 0.1
        height = (tank / (length * width)).toInt()
    }

//    fun volume() = width * height * length / 1000
}