package com.example.kotlinbasics

fun main(){
    //a and b are arguments
    var result = addUp(1,2)
    print("result is $result")

    var meanResult = average(5.3,13.37)
    print("\n mean result is $meanResult")

}

fun addUp(a: Int, b: Int): Int{
    return a + b
}

fun average(a:Double, b:Double): Double{
    return ((a + b)/2)
}
