package net.braniumacademy.exercises15

fun String.listedWord(length: Int) {
    val words = this.split(" ")
    for (item in words) {
        if (item.isNotBlank() && item.length == length) {
            print("$item ")
        }
    }
    println()
}

fun main() {
    val str1 = "Xin chào các bạn nhé"
    val str2 = "Tôi đang học               Kotlin Android trên Branium Academy đây"
    str1.listedWord(3)
    str2.listedWord(7)
}