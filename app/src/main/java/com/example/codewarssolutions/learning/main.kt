package com.example.codewarssolutions.learning

fun main(){
    val numbers = listOf("one", "two", "three", "four")
    // you can use the iterator function to loop over the Iterable
    val numbersIterator=numbers.iterator()
    while (numbersIterator.hasNext())
        println(numbersIterator.next())

    //You can as well use the good ol for loop also
    for (item in numbers){
        println(item)
    }

    //also you can use the automatic forEach function
    numbers.forEach {  theNumber->
        println(theNumber)
    }
}