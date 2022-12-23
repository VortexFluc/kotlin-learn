package oop

class Book(val title: String, var year: Int? = null, var price: Int? = null) {

}

fun main() {
    val book1 = Book("War and Peace")
    book1.year = 1890
    book1.price = 1234

    val book2 = Book("Java")
    val book3 = Book("Kotlin", price = 4564)

    println("${book1.title} : ${book1.year} - ${book1.price}")
    println("${book2.title} : ${book2.year} - ${book2.price}")
    println("${book3.title} : ${book3.year} - ${book3.price}")
}