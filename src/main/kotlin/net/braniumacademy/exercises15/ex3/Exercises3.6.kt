package net.braniumacademy.exercises15.ex3

// hàm tráo đổi hai phần tử ở vị trí bất kì
fun <T> Array<T>.swap(index1: Int, index2: Int) {
    if (index1 in indices && index2 in indices) {
        val tmp = this[index1]
        this[index1] = this[index2]
        this[index2] = tmp
    }
}

fun main() {
    val numbers = arrayOf(0, 144, 1, 233, 2, 3, 5, 8, 13, 89, 55, 34, 16, 21, 101)
    val friends = arrayOf("Mai", "Anh", "Hoa", "Loan", "Khánh", "Bình", "Tuấn", "Chung")
    val gpas = arrayOf(2.25f, 3.25f, 3.45f, 1.58f, 2.98f, 3.65f, 3.33f, 1.98f, 2.45f)
    println("Các phần tử trong mảng sau khi tráo đổi:")
    numbers.swap(0, 6)
    friends.swap(7, 2)
    gpas.swap(2, 7)
    numbers.showElements()
    friends.showElements()
    gpas.showElements()
}