package net.braniumacademy.exercises15

fun String.listedShortestWords() {
    val shortestWord = this.findShortestWord() // gọi hàm mở rộng của ý 1.3
    val words = this.split(" ")
    for (item in words) {
        if (item.isNotBlank() && item.length == shortestWord.length) {
            print("$item ")
        }
    }
    println()
}

fun main() {
    val str1 = "Xin chào các bạn nhé"
    val str2 = "Tôi đang học               Kotlin Android trên Branium Academy đây"
    str1.listedShortestWords()
    str2.listedShortestWords()
}