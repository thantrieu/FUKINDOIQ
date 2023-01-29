package net.braniumacademy.exercises15.ex2

fun Array<Int>.countMaxElements(): Int {
    val max = this.maxElement() // tìm giá trị lớn nhất trong mảng(đã làm ở ý 1)
    var counter = 0 // biến đếm số lượng phần tử có giá trị max
    for (item in this) { // tìm các phần tử trong mảng có giá trị bằng max
        if (item == max) { // nếu tìm thấy thì tăng biến đếm lên
            counter++
        }
    }
    return counter // trả về kết quả
}

fun main() {
    val numbers = arrayOf(100, 3, 2, 100, 4, 7, 8, 9, 100, 0, 100, -20, -54)
    println("Số lượng phần tử có giá trị lớn nhất: ${numbers.countMaxElements()}")
}