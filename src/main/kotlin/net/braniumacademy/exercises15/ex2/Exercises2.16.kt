package net.braniumacademy.exercises15.ex2

// hàm sắp xếp các phần tử trong mảng theo thứ tự tăng dần
fun Array<Int>.sortDESC() {
    for (i in indices) {
        for (j in size - 1 downTo i + 1) {
            if (this[j] > this[j - 1]) {
                val tmp = this[j]
                this[j] = this[j - 1]
                this[j - 1] = tmp
            }
        }
    }
}

fun main() {
    val numbers = arrayOf(0, 144, 1, 233, 2, 3, 5, 8, 13, 89, 55, 34, 16, 21, 101)
    println("Sau sắp xếp:")
    numbers.sortDESC()
    println(numbers.contentDeepToString())
}