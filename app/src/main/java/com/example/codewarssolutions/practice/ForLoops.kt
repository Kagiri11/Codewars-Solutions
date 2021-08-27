package com.example.codewarssolutions.practice

fun main() {
    val numbers = "8 3 -5 42 -1 0 0 -9 4 7 4 -4"
    val num2 = numbers.split(" ").map {
        it.toInt()
    }
    println(num2)

}

fun myFun(numbers: String):String {
   return numbers.split(" ")
       .map { it.toInt() }
       .let { "${it.maxOrNull()} ${it.minOrNull()}" }
}

fun highAndLow(numbers: String): String {
    val num2 = numbers.toMutableList().sorted().filter {
        it.toString() != " "
    }
    return "${num2.last()} ${num2.first()}"
}