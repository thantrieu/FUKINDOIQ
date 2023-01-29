package net.braniumacademy.exercises15.ex2

fun Array<Int>.middleElement(): Int {
    val middIndex = this.size / 2
    return this[middIndex]
}

fun main() {
    val numbers = arrayOf(-20, 3, 2, 100, 4, 7, 8, 9, -20, 0, 100, -20, -4)
    println("Phần tử giữa mảng: ${numbers.middleElement()}")
}