package net.braniumacademy.exercises15.ex3

// hàm mở rộng đảo ngược thứ tự các phần tử trong mảng
fun <T> Array<T>.revertOrder() {
    for (index in 0..size / 2) {
        val tmp = this[index]
        this[index] = this[size - index - 1]
        this[size - index - 1] = tmp
    }
}

fun main() {
    val numbers = arrayOf(0, 144, 1, 233, 2, 3, 5, 8, 13, 89, 55, 34, 16, 21, 101)
    val friends = arrayOf("Mai", "Anh", "Hoa", "Loan", "Khánh", "Bình", "Tuấn", "Chung")
    val gpas = arrayOf(2.25f, 3.25f, 3.45f, 1.58f, 2.98f, 3.65f, 3.33f, 1.98f, 2.45f)
    println("Các phần tử trong mảng sau khi đảo ngược:")
    numbers.revertOrder()
    friends.revertOrder()
    gpas.revertOrder()
    numbers.showElements()
    friends.showElements()
    gpas.showElements()
}