package com.example.codewarssolutions.practice

/**
 * This is the solutions to katas of stage seven
 */
fun main() {
    val names = "Charles"
    val result = names.groupBy(Char::toLowerCase).count {it.value.count() > 1}

    println(result)

}

fun newAvg(a:DoubleArray, navg:Double):Long {
    val result = ((a.size+1)*navg)-a.sum()
    return if (result<=0) throw IllegalArgumentException() else (result).toLong()
}

fun outed(meet: Map<String, Int>, boss: String): String {
    return if ((meet.values.sum()+ meet[boss]!!)/meet.count()>5) "Nice Work Champ!" else "Get Out Now!"
}

fun GroupTotals(strArr: Array<String>): Int {
    val mapArray = mutableListOf<Map<String,Int>>()
    val listOfKeys= mutableListOf<String>()
    val listOfValues= mutableListOf<Int>()
    for(item in strArr){
        val elementKey  = item.substringBefore(":")
        val elementValue  = item.substringAfter(":").toInt()
        listOfKeys.add(elementKey)
        listOfValues.add(elementValue)
        val pair = Pair(elementKey,elementValue)
        val mapOne = mapOf(pair)
        mapArray.add(mapOne)
    }
   println( listOfKeys.toSet())
   println( listOfValues.toSet())

    return mapArray.sumBy {
        val ints = it.values.sum()
        ints
    }
}

fun alphabetWar(fight: String): String {
    var leftCount = 0
    var rightCount = 0
    for(leta in fight){
        when(leta){
            'w' -> leftCount+=4
            'p' -> leftCount+=3
            'b' -> leftCount+=2
            's' -> leftCount+=1
            'm' -> rightCount+=4
            'q' -> rightCount+=3
            'd' -> rightCount+=2
            'z' -> rightCount+=1
        }
    }
    return when{
        leftCount>rightCount -> "Left side wins!"
        leftCount<rightCount -> "Right side wins!"
        else -> " Let's fight again!"

    }
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

fun makeComplement(dna : String) : String {
    return dna.map {
        when(it.toString()){
            "A"-> "T"
            "T"->"A"
            "C"->"G"
            "G"->"C"
            else -> ""
        }
    }.joinToString("")
}

/**This code matches the characters contained in the string parameter to the corresponding numerical number
 * it then adds aup the values and multiplies the result by the index of the string in the array
 * Let's do this ;)
 */

fun nameValue(arr: Array<String>): IntArray{
    val result = mutableListOf<Int>()
    arr.forEach { str->
        var strValue = 0
        val res = arr.indexOf(str)+1
        str.forEach {char->
            ('a'..'z').zip((1..26)).forEach { pair -> if (char == pair.first){ strValue+=pair.second } }
        }
        result.add(strValue*res)
    }
    return result.toIntArray()
}

fun smallEnough(a : IntArray, limit : Int) : Boolean {
    var result = true
    a.forEach { if (it>limit) result=false }
    return result
}

fun duplicateCount(text: String): Int {
    return 0
}