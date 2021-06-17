package classes.aula5

fun main() {
    println("library $library")

    //any()é aplicada a uma lista e demanda um lambda como seu argumento. Exemplo:
    println("${library.any { it.value.contains("Hamlet") }}")

    // Checks for the book title is available in the map or not.
// If the title is not in the map then it will add title into it.
    moreBooks.getOrPut("The Value of Honesty") { "Spencer Johnson" }
    moreBooks.getOrPut("Know Can Do!") { "Kenneth Hartley Blanchard" }

    println("moreBooks $moreBooks")
}

val allBooks = setOf("A Midsummer Night's Dream", "Romeo and Juliet", "Hamlet", "Macbeth",
    "The New One Minute Manager",
    "Kenneth Hartley Blanchard & Spencer Johnson")

val library = mapOf("William Shakespeare" to allBooks)

// Creates a mutable map to hold set of book title/author and adds one title/author to it.
val moreBooks = mutableMapOf("The New One Minute Manager"
        to "Kenneth Hartley Blanchard & Spencer Johnson")

