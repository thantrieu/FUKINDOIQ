package net.braniumacademy.exercises15.ex2

// hàm tìm vị trí phần tử đầu tiên có giá trị bằng k
fun Array<Int>.allIndexOf(k: Int) {
    var counter = 0
    for (index in indices) { // xét trong tập chỉ số hợp lệ của mảng
        if (this[index] == k) { // nếu tìm thấy, trả về về trí tìm đc
            print("$index ")
            counter++
        }
    }
    if(counter == 0) {
        println("Không có kết quả")
    }
}

fun main() {
    val numbers = arrayOf(0, 100, 1, 5, 2, 3, 5, 8, 13, 7, 0, 1, 2, 21, 5)
    numbers.showElements()
    println("\nNhập phần tử cần tìm: ")
    val k = readln().toInt()
    println("Vị trí các phần tử có giá trị $k:")
    numbers.allIndexOf(k)
}