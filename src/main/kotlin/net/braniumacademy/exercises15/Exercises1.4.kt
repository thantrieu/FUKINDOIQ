package net.braniumacademy.exercises15

fun String.listedLongestWords() {
    val longestWord = this.findLongestWord() // gọi hàm mở rộng của ý 1.2
    val words = this.split(" ")
    for (item in words) {
        if (item.isNotBlank() && item.length == longestWord.length) {
            print("$item ")
        }
    }
    println()
}

fun main() {
    val str1 = "Xin chào các bạn nhé"
    val str2 = "Tôi đang học               Kotlin Android trên Branium Academy đây"
    str1.listedLongestWords()
    str2.listedLongestWords()
}