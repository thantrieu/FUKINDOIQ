package net.braniumacademy.exercises15

fun String.countVowel(): Int {
    var counter = 0
    for(c in this) {
        val character = c.uppercase()[0]
        if (character == 'A' || character == 'E' || character == 'I'
            || character == 'O' || character == 'U') {
            counter++
        }
    }
    return counter
}

fun main() {
    val str1 = "Welcome to Branium Academy"
    val str2 = "I'm learning Android Kotlin on Branium Academy"
    println("Số lượng nguyên âm: ${str1.countVowel()}")
    println("Số lượng nguyên âm: ${str2.countVowel()}")
}