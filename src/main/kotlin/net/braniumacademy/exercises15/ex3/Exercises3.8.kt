package net.braniumacademy.exercises15.ex3

// hàm mở rộng đếm số lần xuất hiện của phần tử có giá trị k trong mảng kiểu T
fun <T> Array<T>.countOccurrence(k: T): Int {
    var counter = 0 // ban đầu không tồn tại k
    for (index in indices) { // tìm k
        if (this[index] == k) { // nếu thấy
            counter++ // tăng biến đếm lên 1 đơn vị
        }
    }
    return counter // trả về kết quả
}

fun main() {
    val numbers = arrayOf(0, 144, 1, 233, 2, 3, 5, 8, 13, 89, 55, 34, 16, 21, 101)
    val friends = arrayOf("Mai", "Anh", "Hoa", "Loan", "Khánh", "Bình", "Tuấn", "Chung")
    val gpas = arrayOf(2.25f, 3.25f, 3.45f, 1.58f, 2.98f, 3.65f, 3.45f, 1.98f, 2.45f)

    val k = 2
    val k2 = "Hoa"
    val k3 = 3.45f
    println("'$k' xuất hiện: ${numbers.countOccurrence(k)} lần")
    println("'$k2' xuất hiện: ${friends.countOccurrence(k2)} lần")
    println("'$k3' xuất hiện: ${gpas.countOccurrence(k3)} lần")
}