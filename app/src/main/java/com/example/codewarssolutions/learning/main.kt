package com.example.codewarssolutions.learning

fun main(){
    val numbers = listOf("one", "two", "three", "four")
    // you can use the iterator function to loop over the Iterable
    val numbersIterator=numbers.iterator()
    val numbersListIterator = numbers.listIterator()
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

    //Iterating using the list iterator
    while (numbersListIterator.hasNext()){
        println(numbersListIterator.next())
    }

    //Iterating backwards using the list iterator
    while (numbersListIterator.hasPrevious()){
        println("${numbersListIterator.previousIndex()}:${numbersListIterator.previous()}")
    }
}