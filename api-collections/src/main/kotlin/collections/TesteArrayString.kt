package collections

fun main() {
    val nomes = Array(3){""}

    nomes[0] = "Aslam"
    nomes[1] = "Giulliane"
    nomes[2] = "Blue"

    nomes.forEach {
        println(it)
    }

val nomes2 = arrayOf("nome1", "nome2", "nome3")

    nomes2.forEach {
        println(it)
    }

}