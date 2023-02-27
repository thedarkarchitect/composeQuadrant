package com.example.kotlinbasics

fun main(){
    var myCar = Car()
    myCar.owner
    println("brand is :${myCar.myBrand}")
    println("Maxsped is ${myCar.maxSpeed}")
}

class Car(){
    lateinit var owner : String

    val myBrand: String = "BMW"
        //custom getter
    get(){
        return field.toLowerCase()
    }

    var maxSpeed: Int = 350

    init{
        this.owner = "Frank"

    }
}