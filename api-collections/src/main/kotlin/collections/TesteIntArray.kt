package collections

fun main() {
 val values = IntArray(5)

 values[0] = 1
    values[1] = 2
    values[2] = 5
    values[3] = 4
    values[4] = 3

    for(valor in values){
//        println(valor)
    }

    values.forEach {
//        println(it*2)
    }

    for(index in values.indices){
//        println(values[index])
    }

    values.sort()
    for(valor in values){
     println(valor)
    }

}