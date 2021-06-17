package classes.aula5

fun main() {

    val book = Book("Romeo and Juliet", "William Shakespeare", 1597)

    println("Aqui esta o livro ${book.title}, " +
            "escrito por ${book.author} em ${book.year}")

    val bookTitleAuthor = book.getTitleAuthor()
    val bookTitleAuthorYear = book.getTitleAuthorYear()

    println("Here is your book ${bookTitleAuthor.first} by ${bookTitleAuthor.second}")

    println("Here is your book ${bookTitleAuthorYear.first} " +
            "by ${bookTitleAuthorYear.second} written in ${bookTitleAuthorYear.third}")

}


class Book(val title: String, val author: String, val year: Int){

    fun getTitleAuthor() : Pair<String, String>{
        return (title to author)
    }

    fun getTitleAuthorYear() : Triple<String,String,Int>{
        return Triple(title,author,year)
    }
}
