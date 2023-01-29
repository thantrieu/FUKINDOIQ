package net.braniumacademy.exercises15.ex2

fun Array<Int>.minElement(): Int {
    var min = this[0] // giả định giá trị min là phần tử đầu tiên trong mảng
    for (item in this) { // tìm phần tử nhỏ hơn trong mảng
        if (item < min) { // nếu tìm thấy thì cập nhật lại giá trị min
            min = item
        }
    }
    return min // trả về giá trị nhỏ nhất trong mảng
}

fun main() {
    val numbers = arrayOf(1, 3, 2, 5, 4, 7, 8, 9, 6, 0, 100, -20, -54)
    println("Giá trị nhỏ nhất trong mảng: ${numbers.minElement()}")
}