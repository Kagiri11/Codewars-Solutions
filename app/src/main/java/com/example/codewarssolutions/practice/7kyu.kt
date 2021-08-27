package com.example.codewarssolutions.practice
/**
 * This is the solutions to katas of this stage
 */
fun main(){
    val strarr = listOf("tree", "foling", "trashy", "blue", "abcdef", "uvwxyz")
    val artist= "Charles"
    println(removeChar(artist))
}


fun longestConsec(strarr:Array<String>, k:Int):String {
    val newList= mutableListOf<String>()

    return " "
}

fun removeChar(str: String): String {
    return str.drop(1).dropLast(1)
}

fun getAge(yearsOld: String): Int {
    return yearsOld[0].toInt()
}

