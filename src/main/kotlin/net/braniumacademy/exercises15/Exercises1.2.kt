package net.braniumacademy.exercises15

fun String.findLongestWord(): String {
    var result = ""
    val words = this.split(" ")
    for (item in words) {
        if (item.length > result.length) {
            result = item
        }
    }
    return result
}

fun main() {
    val str1 = "                   "
    val str2 = "Tôi đang học               Kotlin đây"
    println(str1.findLongestWord())
    println(str2.findLongestWord())
}