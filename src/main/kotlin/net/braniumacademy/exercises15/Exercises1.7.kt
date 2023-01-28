package net.braniumacademy.exercises15

fun String.upperAndLower(): String {
    val words = this.split(" ")
    val builder = StringBuilder()
    var counter = 0
    for (item in words) {
        if (item.isNotBlank()) {
            counter++
            if (counter % 2 == 1) {
                builder.append(item.uppercase()).append(" ")
            } else {
                builder.append(item.lowercase()).append(" ")
            }
        }
    }
    return builder.toString().trim()
}

fun main() {
    val str1 = "Xin chào các bạn nhé"
    val str2 = "Tôi đang học               Kotlin Android trên Branium Academy đây"
    println("Chuỗi sau khi xử lý: ${str1.upperAndLower()}")
    println("Chuỗi sau khi xử lý: ${str2.upperAndLower()}")
}