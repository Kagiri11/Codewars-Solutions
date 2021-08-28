package com.example.codewarssolutions.practice

fun main() {
    val name = "Eunice".splitToSequence("un").joinToString().trim().lines()
    println(name)
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