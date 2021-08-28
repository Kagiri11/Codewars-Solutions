package com.example.codewarssolutions.practice

/**
 * This is the solutions to katas of this stage
 */
fun main() {
    val strarr = listOf("tree", "foling", "trashy", "blue", "abcdef", "uvwxyz")
    val artist = "14 years old"
    val nums = arrayOf(0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14)

    val name = "Charles"

    println(getCount(name))
}


fun longestConsec(strarr: Array<String>, k: Int): String {
    val newList = mutableListOf<String>()

    return " "
}

fun removeChar(str: String): String {
    return str.drop(1).dropLast(1)
}

fun getAge(yearsOld: String): Int {

    return yearsOld.split(" ")[0].toInt()
}

fun countPositivesSumNegatives(input: Array<Int>?): Array<Int> {
    return if (input.isNullOrEmpty()) {
        emptyArray()
    } else {
        arrayOf(input.filter { it>0 }.count(),input.filter { it<0 }.sum())
    }
}

fun dutyFree(normPrice: Int, discount:Int, hol:Int) : Int = hol * 100 / (normPrice * discount)

fun getCount(str:String):Int{
    return str.filter { "aeiou".contains(it) }.map { it }.count()
}

