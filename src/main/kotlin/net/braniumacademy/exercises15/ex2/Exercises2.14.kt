package net.braniumacademy.exercises15.ex2

// hàm kiểm tra số fibonacci
fun isFibonacci(n: Int): Boolean {
    var fn = 0
    var f0 = 0
    var f1 = 1
    while (fn <= n) {
        fn = f0 + f1
        if (fn == n) {
            return true
        }
        f0 = f1
        f1 = fn
    }
    return false
}

// hàm liệt kê các số fibonacci lớn hơn k
fun Array<Int>.fibonacciNumbers(k: Int) {
    this.sort() // sắp xếp để các phần tử theo thứ tự tăng dần
    for (item in this) {
        if (item > k && isFibonacci(item)) {
            print("$item ")
        }
    }
}

fun main() {
    val numbers = arrayOf(0, 144, 1, 233, 2, 3, 5, 8, 13, 89, 55, 34, 16, 21, 101)
    println("Nhập k: ")
    val k = readln().toInt()
    println("Các số fibonacci lớn hơn $k trong mảng:")
    numbers.fibonacciNumbers(k)
}