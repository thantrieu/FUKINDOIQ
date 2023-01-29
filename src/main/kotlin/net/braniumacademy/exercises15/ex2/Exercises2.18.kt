package net.braniumacademy.exercises15.ex2

fun Array<Int>.swap(index1: Int, index2: Int) {
    if (index1 in indices && index2 in indices) {
        val tmp = this[index1]
        this[index1] = this[index2]
        this[index2] = tmp
    }
}

fun main() {
    val numbers = arrayOf(0, 144, 1, 233, 2, 3, 5, 8, 13, 89, 55, 34, 16, 21, 101)
    println("Các phần tử trong mảng gốc:")
    numbers.showElements()
    println("Các phần tử trong mảng sau khi đổi chỗ: ")
    numbers.swap(0, 10)
    numbers.showElements()
}