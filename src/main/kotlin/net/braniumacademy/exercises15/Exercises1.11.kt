package net.braniumacademy.exercises15

fun String.countAlphabetCharacters(): Int {
    var counter = 0
    for (c in this) {
        val character = c.uppercase()[0]
        if (character in 'A'..'Z') {
            counter++
        }
    }
    return counter
}

fun main() {
    val str1 = "Welcome to Branium Academy */-+)(876^%*&@!~!"
    val str2 = "I'm learning Android Kotlin on Branium Academy 2023"
    println("Số lượng kí tự chữ cái: ${str1.countAlphabetCharacters()}")
    println("Số lượng kí tự chữ cái: ${str2.countAlphabetCharacters()}")
}