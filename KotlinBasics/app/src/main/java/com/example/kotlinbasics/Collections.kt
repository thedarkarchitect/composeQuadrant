package com.example.kotlinbasics

fun main(){

    //val numbers: IntArray = intArrayOf(1,2,3,4,5,6,7,8,9)
    //val numbers = intArrayOf(1,2,3,4,5,6,7,8,9)
    val numbers = arrayOf(1,2,3,4,5,6,7,8,9)
//    print(numbers.contentToString())
    for (elements in numbers){
        print(elements)
    }
}