package net.braniumacademy.exercises15.ex2

fun Array<Int>.showElements() {
    for (item in this) {
        print("$item ")
    }
}

fun main() {
    val numbers = arrayOf(0, 144, 1, 233, 2, 3, 5, 8, 13, 89, 55, 34, 16, 21, 101)
    println("Các phần tử trong mảng:")
    numbers.sortDESC()
    numbers.showElements()
}