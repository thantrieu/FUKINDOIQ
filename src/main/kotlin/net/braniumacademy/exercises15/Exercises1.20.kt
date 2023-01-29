package net.braniumacademy.exercises15

fun String.standardized(): String {
    // tách các từ sau khi loại bỏ khoảng trắng đầu, cuối chuỗi
    val words = this.trim().split(" ")
    val builder = StringBuilder() // chuỗi kết quả
    for (item in words) {
        if (item.isNotBlank()) {
            // viết thường các từ, sau đó chuyển sang mảng Char
            val word = item.lowercase().toCharArray()
            word[0] = word[0].uppercase()[0] // viết hoa chữ cái đầu từ
            builder.append(word).append(" ") // nối từ vào chuỗi kết quả
        }
    }
    return builder.toString().trim() // loại bỏ khoảng trắng thừa ở cuối chuỗi
}

fun main() {
    val str1 = "     WelCOme tO         branIUm acadeMY   Would you      liKE to learn andROID?    "
    val str2 = "   I'M    lEARning     AndROid Kotlin      oN branium AcadEMY      2023   "
    println("Kết quả: ${str1.standardized()}")
    println("Kết quả: ${str2.standardized()}")
}