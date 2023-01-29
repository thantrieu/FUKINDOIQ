package net.braniumacademy.exercises15.ex2

import kotlin.math.sqrt

// hàm kiểm tra số chính phương
fun isSquareRoot(n: Int): Boolean {
    val x = sqrt(n.toDouble()).toInt()
    return x * x == n
}

// hàm liệt kê các số chính phương trong mảng
fun Array<Int>.listedSquareRootNumbers() {
    for (item in this) {
        if (isSquareRoot(item)) {
            print("$item ")
        }
    }
}

fun main() {
    val numbers = arrayOf(-20, 3, 2, 100, 4, 7, 8, 9, -2, 0, 16, -11, 107)
    println("Các số chính phương trong mảng:")
    numbers.listedSquareRootNumbers()
}