package net.braniumacademy.exercises15

fun String.trimAll(): String {
    // tách các từ sau khi loại bỏ khoảng trắng đầu, cuối chuỗi
    val words = this.trim().split(" ")
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
    val str1 = "     Welcome to         Branium Academy   Would you      like to learn Android?    "
    val str2 = "   I'm    learning     Android Kotlin      on Branium Academy      2023   "
    println("Nội dung đã chuẩn hóa: ${str1.trimAll()}")
    println("Nội dung đã chuẩn hóa: ${str2.trimAll()}")
}