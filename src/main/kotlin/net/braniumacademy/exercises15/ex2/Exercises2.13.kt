package net.braniumacademy.exercises15.ex2

fun Array<Int>.primeNumbers(k: Int) {
    this.sort() // sắp xếp để các phần tử theo thứ tự tăng dần
    for (item in this) {
        if (item > k && isPrime(item)) {
            print("$item ")
        }
    }
}

fun main() {
    val numbers = arrayOf(-20, 11, 2, 100, 505, 7, 803, 997, -2, 0, 16, 1111, 101)
    println("Nhập k: ")
    val k = readln().toInt()
    println("Các số nguyên tố lớn hơn $k trong mảng:")
    numbers.primeNumbers(k)
}