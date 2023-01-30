package net.braniumacademy.exercises15.ex3

fun <T> Array<T>.firstIndexOf(k: T): Int {
    for (index in indices) {
        if(this[index] == k) {
            return index
        }
    }
    return -1 // mặc định là không tồn tại chỉ số phần tử bằng k
}

fun main() {
    val numbers = arrayOf(0, 144, 1, 233, 2, 3, 5, 8, 13, 89, 55, 34, 16, 21, 101)
    val friends = arrayOf("Mai", "Anh", "Hoa", "Loan", "Khánh", "Bình", "Tuấn", "Chung")
    val gpas = arrayOf(2.25f, 3.25f, 3.45f, 1.58f, 2.98f, 3.65f, 3.33f, 1.98f, 2.45f)
    val k = 2
    val k2 = "Hoa"
    val k3 = 3.99f
    println("Vị trí phần tử '$k' đầu tiên: ${numbers.firstIndexOf(k)}")
    println("Vị trí phần tử '$k2' đầu tiên: ${friends.firstIndexOf(k2)}")
    println("Vị trí phần tử '$k3' đầu tiên: ${gpas.firstIndexOf(k3)}")
}