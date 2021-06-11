package classes

fun main() {
    filter()
}

fun filter(){
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

    val filterCurry = spices.filter { it.contains("curry") }.sortedBy { it.length }
    println("filterCurry = $filterCurry")

    val startCEndE = spices.filter { it.startsWith('c') && it.endsWith('e') }
        println("startCEndE = $startCEndE")

    val startCEndE2 = spices.filter{it.startsWith('c')}.filter{it.endsWith('e')}
    println("startCEndE2 = $startCEndE2")

    val takeFirstThreeElStartWithC = spices.take(3).filter { it.startsWith('c') }
    println("takeFirstThreeElStartWithC = $takeFirstThreeElStartWithC")
}