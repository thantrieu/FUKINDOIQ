package net.braniumacademy.exercises15.ex2

// hàm liệt kê các số đối xứng trong mảng
fun Array<Int>.elementDivideByK(k: Int) {
    for (item in this) {
        if (item % k == 0) {
            print("$item ")
        }
    }
}

fun main() {
    val numbers = arrayOf(-20, 33433, 2, 100, 505, 7, 800, 999, -2, 0, 16, 1111, 107010)
    println("Nhập k: ")
    val k = readln().toInt()
    println("Các số chia hết cho $k trong mảng:")
    numbers.elementDivideByK(k)
}