package classes

import java.util.*

fun main() {
//    println(rollDice(6))
//    println(rollDice0(6))
    gamePlay(rollDice2(6))
}

//Crie um lambda e atribua-o a rollDice, que retorna um lançamento de dado (número entre 1 e 12).
//val rollDice = { Random().nextInt(12) + 1}

//Estenda o lambda para fazer um argumento indicando o número de lados dos dados usados para o teste.
val rollDice = { sides: Int ->
    when(sides){
        0 -> 0
     else ->Random().nextInt(sides) + 1
    }
}

val rollDice0 = { sides: Int ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1
}

//Crie uma nova variável, rollDice2, para este mesmo lambda usando a notação de tipo de função.
val rollDice2: (Int) -> Int = {
    sides ->
    if(sides == 0) 0
    else Random().nextInt(sides) + 1
}

fun gamePlay(diceRoll: Int) {

    println(diceRoll)
}