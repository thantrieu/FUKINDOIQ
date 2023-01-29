package net.braniumacademy.exercises15.ex2

fun Array<Int>.countElements(k: Int): Int {
    var counter = 0 // biến đếm số lượng phần tử có giá trị k
    for (item in this) { // tìm các phần tử trong mảng có giá trị bằng k
        if (item == k) { // nếu tìm thấy thì tăng biến đếm lên
            counter++
        }
    }
    return counter // trả về kết quả
}

fun main() {
    val numbers = arrayOf(-20, 3, 2, 100, 4, 7, 8, 9, -20, 0, 100, -20, -4)
    val k = -20
    println("Số lượng phần tử có giá trị $k: ${numbers.countElements(k)}")
}