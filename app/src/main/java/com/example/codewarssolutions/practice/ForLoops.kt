package com.example.codewarssolutions.practice

fun main() {
    val myList = listOf(4,6,84,2,)
    val result = myList.all {
        it%2==0
    }
    println(result)
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