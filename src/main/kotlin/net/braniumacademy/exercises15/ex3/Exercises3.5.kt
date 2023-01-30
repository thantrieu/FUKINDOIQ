package net.braniumacademy.exercises15.ex3

// hàm reset các phần tử trong mảng về giá trị k cho trước
fun <T> Array<T>.resetTo(k: T) {
    for (index in indices) {
        this[index] = k
    }
}

fun main() {
    val numbers = arrayOf(0, 144, 1, 233, 2, 3, 5, 8, 13, 89, 55, 34, 16, 21, 101)
    val friends = arrayOf("Mai", "Anh", "Hoa", "Loan", "Khánh", "Bình", "Tuấn", "Chung")
    val gpas = arrayOf(2.25f, 3.25f, 3.45f, 1.58f, 2.98f, 3.65f, 3.33f, 1.98f, 2.45f)
    println("Các phần tử trong mảng sau khi reset:")
    numbers.resetTo(0)
    friends.resetTo("Hoa")
    gpas.resetTo(2.5f)
    numbers.showElements()
    friends.showElements()
    gpas.showElements()
}