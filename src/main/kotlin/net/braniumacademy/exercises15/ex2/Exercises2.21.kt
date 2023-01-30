package net.braniumacademy.exercises15.ex2

// hàm mở rộng tìm các phần tử chẵn trong mảng
fun Array<Int>.showEvenElements() {
    for (item in this) {
        if (item % 2 == 0) {
            print("$item ")
        }
    }
}

fun main() {
    val numbers = arrayOf(0, 100, 1, 5, 2, 3, 5, 8, 13, 7, 0, 1, 2, 21, 5)
    numbers.showElements()
    println("Các phần tử chẵn trong mảng:")
    numbers.showEvenElements()
}