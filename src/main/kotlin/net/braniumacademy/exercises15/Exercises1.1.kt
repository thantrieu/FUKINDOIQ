package net.braniumacademy.exercises15

fun String.countWord(): Int {
    val words = this.split(" ")
    var counter = 0
    for (item in words) {
        if (item.isNotBlank()) {
            counter++
        }
    }
    return counter
}

fun main() {
    val str1 = "                   "
    val str2 = "Tôi đang học               Kotlin đây"
    println(str1.countWord())
    println(str2.countWord())
}