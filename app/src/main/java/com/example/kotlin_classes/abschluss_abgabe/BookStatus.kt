package com.example.kotlin_classes.abschluss_abgabe

sealed class BookStatus {
    object Available : BookStatus() {
        override fun getStatusDescription(): String = "The book is available."
    }

    data class CheckedOut(val dueDate: String) : BookStatus() {
        override fun getStatusDescription(): String = "The book is checked out and due on $dueDate."
    }

    data class Reserved(val reservedBy: String) : BookStatus() {
        override fun getStatusDescription(): String = "The book is reserved by $reservedBy."
    }

    abstract fun getStatusDescription(): String
}