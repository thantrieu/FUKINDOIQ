package net.braniumacademy.exercises15

fun String.capAllWords(): String {
    // tách các từ sau khi loại bỏ khoảng trắng đầu, cuối chuỗi
    val words = this.trim().split(" ")
    val builder = StringBuilder()
    for (item in words) {
        if (item.isNotBlank()) {
            val word = item.toCharArray()
            word[0] = word[0].uppercase()[0]
            builder.append(word).append(" ")
        }
    }
    return builder.toString().trim() // loại bỏ khoảng trắng thừa ở cuối chuỗi
}

fun main() {
    val str1 = "     Welcome to         branium academy   Would you      like to learn android?    "
    val str2 = "   I'm    learning     Android Kotlin      on branium Academy      2023   "
    println("Kết quả: ${str1.capAllWords()}")
    println("Kết quả: ${str2.capAllWords()}")
}