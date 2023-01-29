package net.braniumacademy.exercises15.ex2

fun Array<Int>.sumElements(): Int {
    var sum = 0 // biến tổng
    for (item in this) {
        sum += item // cộng dồn từng phần tử vào tổng
    }
    return sum // trả về kết quả
}

fun main() {
    val numbers = arrayOf(-20, 3, 2, 100, 4, 7, 8, 9, -20, 0, 100, -20, -4)
    println("Tổng: ${numbers.sumElements()}")
}