package net.braniumacademy.exercises15.ex2

import kotlin.math.sqrt

fun isPrime(n: Int): Boolean { // hàm kiểm tra số nguyên tố
    if (n < 2) {
        return false
    }
    val bound = sqrt(n.toDouble()).toInt()
    for (k in 2..bound) {
        if (n % k == 0) {
            return false
        }
    }
    return true
}

fun Array<Int>.listedPrimeNumbers() {
    for (item in this) {
        if (isPrime(item)) {
            print("$item ")
        }
    }
}

fun main() {
    val numbers = arrayOf(-20, 3, 2, 100, 4, 7, 8, 9, -2, 0, 100, -11, 107)
    println("Các phần tử là số nguyên tố trong mảng:")
    numbers.listedPrimeNumbers()
}