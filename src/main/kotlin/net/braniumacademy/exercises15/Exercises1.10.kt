package net.braniumacademy.exercises15

fun String.countDigits(): Int {
    var counter = 0
    for (c in this) {
        val character = c.uppercase()[0]
        if (character in '0'..'9') {
            counter++
        }
    }
    return counter
}

fun main() {
    val str1 = "Welcome to Branium Academy"
    val str2 = "I'm learning Android Kotlin on Branium Academy 2023"
    println("Số lượng kí tự số: ${str1.countDigits()}")
    println("Số lượng kí tự số: ${str2.countDigits()}")
}