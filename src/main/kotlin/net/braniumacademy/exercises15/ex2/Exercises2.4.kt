package net.braniumacademy.exercises15.ex2

fun Array<Int>.countMinElements(): Int {
    val min = this.minElement() // tìm giá trị nhỏ nhất trong mảng(đã làm ở ý 1)
    var counter = 0 // biến đếm số lượng phần tử có giá trị min
    for (item in this) { // tìm các phần tử trong mảng có giá trị bằng min
        if (item == min) { // nếu tìm thấy thì tăng biến đếm lên
            counter++
        }
    }
    return counter // trả về kết quả
}

fun main() {
    val numbers = arrayOf(-20, 3, 2, 100, 4, 7, 8, 9, -20, 0, 100, -20, -4)
    println("Số lượng phần tử có giá trị nhỏ nhất: ${numbers.countMinElements()}")
}