package com.example.kotlin_classes.abschluss_abgabe

fun main() {
    val library = Library()

    library.addBook(Book("The Great Gatsby", "F. Scott Fitzgerald", Genre.FICTION, BookStatus.Available))
    library.addBook(Book("1984", "George Orwell", Genre.HISTORY, BookStatus.Available))
    library.addBook(Book("To Kill a Mockingbird", "Harper Lee", Genre.NON_FICTION, BookStatus.Available))

    val address = Library.LibraryAddress("123 Library St", "Booktown", "12345")
    address.printAddress()

    val member = library.LibraryMember("Alice", "M001")

    println("\nInitial Book Statuses:")
    library.displayBookStatuses()

    println("\nMember Actions:")
    val bookToCheckout = library.searchBooks("1984").firstOrNull()
    bookToCheckout?.let { member.checkoutBook(it, "2024-12-31") }

    val bookToReserve = library.searchBooks("To Kill a Mockingbird").firstOrNull()
    bookToReserve?.let { member.reserveBook(it) }

    println("\nUpdated Book Statuses:")
    library.displayBookStatuses()
}