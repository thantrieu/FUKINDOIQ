package net.braniumacademy.exercises15

fun String.sortWordDESC(): String {
    // sắp xếp các từ theo thứ tự a-z sau đó đảo ngược
    val words = this.split(" ").sorted().reversed()
    val builder = StringBuilder()
    // tạo danh sách từ không chứa các khoảng trắng thừa
    for (item in words) {
        if (item.isNotBlank()) {
            builder.append(item).append(" ")
        }
    }
    return builder.toString().trim() // loại bỏ khoảng trắng thừa ở cuối chuỗi
}

fun main() {
    val str1 = "Welcome to         Branium Academy       "
    val str2 = "I'm learning     Android Kotlin on Branium Academy 2023   "
    println("Các từ trong câu sau khi sắp xếp: ${str1.sortWordDESC()}")
    println("Các từ trong câu sau khi sắp xếp: ${str2.sortWordDESC()}")
}