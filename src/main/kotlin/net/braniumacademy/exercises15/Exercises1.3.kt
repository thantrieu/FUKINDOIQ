package net.braniumacademy.exercises15

fun String.findShortestWord(): String {
    var result = this
    val words = this.split(" ")
    for (item in words) {
        if (item.isNotBlank() && item.length < result.length) {
            result = item
        }
    }
    return result
}

fun main() {
    val str1 = "                   "
    val str2 = "Tôi đang học               Kotlin đây"
    println(str1.findShortestWord())
    println(str2.findShortestWord())
}