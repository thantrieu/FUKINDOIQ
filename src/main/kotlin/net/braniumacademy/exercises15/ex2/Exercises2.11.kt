package net.braniumacademy.exercises15.ex2

// hàm kiểm tra số đối xứng
fun isSymmetry(n: Int): Boolean {
    var revNumber = 0
    var other = n
    while (other > 0) {
        revNumber = revNumber * 10 + other % 10
        other /= 10
    }
    return revNumber == n
}

// hàm liệt kê các số đối xứng trong mảng
fun Array<Int>.listedSymmetryNumbers() {
    for (item in this) {
        if (isSymmetry(item)) {
            print("$item ")
        }
    }
}

fun main() {
    val numbers = arrayOf(-20, 33433, 2, 100, 505, 7, 800, 999, -2, 0, 16, 1111, 107010)
    println("Các số đối xứng trong mảng:")
    numbers.listedSymmetryNumbers()
}