package classes.aula5

fun main() {

fun canBorrow(hasBooks: Int): Boolean {
    return hasBooks <= MAX_NUMBER_BOOKS

}

println("Can borrow book? ${canBorrow(5)}")
}

//const nao pode receber uma funcao
// Meaning that their value has to be assigned during compile time,
// unlike vals, where it can be done at runtime.
const val MAX_NUMBER_BOOKS = 5

class Book2{
    companion object {
        const val BASE_URL = "https://www.bookstore.com/books/all/"
    }



    fun printUrl(bookTitle: String) {
        println("Book-URL :- ${BASE_URL.plus(bookTitle).plus(".html")}")
    }
}



