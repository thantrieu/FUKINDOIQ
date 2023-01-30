package net.braniumacademy.exercises14

import kotlin.math.sqrt

interface NumberChecker {
    fun isPrime(n: Int): Boolean
    fun isSymmetry(n: Int): Boolean
    fun isRevertPrime(n: Int): Boolean
    fun isSumDigitsPrime(n: Int): Boolean
}


class NumberCheckerImp : NumberChecker {
    override fun isPrime(n: Int): Boolean {
        if (n < 2) {
            return false
        }
        val bound = sqrt(n.toDouble()).toInt()
        for (i in 2..bound) {
            if (n % i == 0) {
                return false
            }
        }
        return true
    }

    override fun isSymmetry(n: Int): Boolean {
        var m = n
        var revNumber = 0
        while (m > 0) {
            revNumber = revNumber * 10 + m % 10
            m /= 10
        }
        return revNumber == n
    }

    override fun isRevertPrime(n: Int): Boolean {
        var m = n
        var revNumber = 0
        while (m > 0) {
            revNumber = revNumber * 10 + m % 10
            m /= 10
        }
        return isPrime(revNumber)
    }

    override fun isSumDigitsPrime(n: Int): Boolean {
        var m = n
        var sum = 0
        while (m > 0) {
            sum += m % 10
            m /= 10
        }
        return isPrime(sum)
    }
}

fun main() {
    println("Nhập số n: ")
    val n = readln().toInt()
    val checker = NumberCheckerImp()
    println("$n là số nguyên tố? ${checker.isPrime(n)}")
    println("$n là số thuận nghịch? ${checker.isSymmetry(n)}")
    println("Số đảo của $n là số nguyên tố? ${checker.isRevertPrime(n)}")
    println("Tổng chữ số của $n là số nguyên tố? ${checker.isSumDigitsPrime(n)}")
}