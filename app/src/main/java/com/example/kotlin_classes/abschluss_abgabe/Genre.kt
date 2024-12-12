package com.example.kotlin_classes.abschluss_abgabe

enum class Genre (private val description: String) {
    FICTION("Fictional stories and novels"),
    NON_FICTION("Based on factual information and real events"),
    SCIENCE("Books related to scientific topics and discoveries"),
    HISTORY("Books about historical events and figures"),
    CHILDREN("Books intended for young readers");

    fun printDescription() {
        println(description)
    }
}
