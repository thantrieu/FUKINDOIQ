package net.braniumacademy.exercises15.ex2

fun Array<Int>.avg(): Float {
    val sum = this.sumElements()
    return sum * 1.0f / this.size
}

fun main() {
    val numbers = arrayOf(-20, 3, 2, 100, 4, 7, 8, 9, -20, 0, 100, -20, -4)
    println("TB: ${numbers.avg()}")
}