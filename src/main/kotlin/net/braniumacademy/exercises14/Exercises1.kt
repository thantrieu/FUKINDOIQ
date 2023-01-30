package net.braniumacademy.exercises14

import kotlin.math.pow

interface Calculator {
    fun add(a: Double, b: Double): Double // phương thức thực hiện phép tính cộng
    fun minus(a: Double, b: Double): Double // phương thức thực hiện phép tính trừ
    fun mul(a: Double, b: Double): Double // phương thức thực hiện phép tính nhân
    fun div(a: Double, b: Double): Double // phương thức thực hiện phép tính chia
    fun pow(a: Double, b: Double): Double // phương thức thực hiện phép tính a mũ b
}

// lớp triển khai các phương thức abstract
class CalculatorImp : Calculator {
    override fun add(a: Double, b: Double) = a + b

    override fun minus(a: Double, b: Double) = a - b

    override fun mul(a: Double, b: Double) = a * b

    override fun div(a: Double, b: Double) = a / b

    override fun pow(a: Double, b: Double) = a.pow(b)
}

fun main() {
    print("Nhập số a: ")
    val a = readln().toDouble()
    print("Nhập số b: ")
    val b = readln().toDouble()

    // thực hiện phép toán
    val calculator = CalculatorImp()
    println("$a + $b = ${calculator.add(a, b)}")
    println("$a - $b = ${calculator.minus(a, b)}")
    println("$a * $b = ${calculator.mul(a, b)}")
    println("$a / $b = ${calculator.div(a, b)}")
    println("$a ^ $b = ${calculator.pow(a, b)}")
}
