package net.braniumacademy.exercises15

fun String.countUppercaseCharacters(): Int {
    var counter = 0
    for (c in this) {
        if (c in 'A'..'Z') {
            counter++
        }
    }
    return counter
}

fun main() {
    val str1 = "Welcome to Branium Academy */-+)(876^%*&@!~!"
    val str2 = "I'm learning Android Kotlin on Branium Academy 2023"
    println("Số lượng kí tự chữ cái hoa: ${str1.countUppercaseCharacters()}")
    println("Số lượng kí tự chữ cái hoa: ${str2.countUppercaseCharacters()}")
}