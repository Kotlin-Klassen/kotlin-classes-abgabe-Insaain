package com.example.kotlin_classes.abschluss_abgabe

class Library {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun searchBooks(query: String): List<Book> {
        return books.filter { it.title.contains(query, ignoreCase = true) || it.author.contains(query, ignoreCase = true) }
    }

    fun displayBookStatuses() {
        books.forEach { book ->
            println("Title: ${book.title}, Author: ${book.author}, Status: ${book.status.getStatusDescription()}")
        }
    }

    class LibraryAddress(private val street: String, private val city: String, private val zipCode: String) {
        fun printAddress() {
            println("Library Address: $street, $city, $zipCode")
        }
    }

    inner class LibraryMember(private val name: String, private val memberID: String) {

        fun checkoutBook(book: Book, dueDate: String) {
            if (book.status is BookStatus.Available) {
                book.status = BookStatus.CheckedOut(dueDate)
                println("$name checked out '${book.title}' with due date $dueDate.")
            } else {
                println("The book '${book.title}' is not available for checkout.")
            }
        }

        fun reserveBook(book: Book) {
            if (book.status is BookStatus.Available) {
                book.status = BookStatus.Reserved(name)
                println("$name reserved the book '${book.title}'.")
            } else {
                println("The book '${book.title}' cannot be reserved at the moment.")
            }
        }
    }
}
