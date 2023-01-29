package net.braniumacademy.exercises15.ex2

fun Array<Int>.maxElement(): Int {
    var max = this[0] // giả định giá trị max là phần tử đầu tiên trong mảng
    for (item in this) { // tìm phần tử lớn hơn trong mảng
        if (item > max) { // nếu tìm thấy thì cập nhật lại giá trị max
            max = item
        }
    }
    return max // trả về giá trị lớn nhất trong mảng
}

fun main() {
    val numbers = arrayOf(1, 3, 2, 5, 4, 7, 8, 9, 6, 0, 100, -20, -54)
    println("Giá trị lớn nhất trong mảng: ${numbers.maxElement()}")
}