package com.example.kotlinbasics

fun main(){
    var kevin = Person("Roman", "Reynolds", 32)
    //we set the hooby by
    kevin.hobby = "Coding"
    kevin.stateHobby()//this by itself return the default variable set in the member variables

    kevin.age = 45//this changes the value of the age
    println("Denis is ${kevin.age } years old")
}
//constructor all us to add values to the class
class Person constructor(firstName: String, lastName: String){
    //Member Variables - properties
    var age : Int? = null
    var hobby : String = "Watch Netflix"
    var firstName : String? = null //this variable is going to let us target and access the firstName and use it later

    //Initialzer Block or prepartion section
    init{
        this.firstName = firstName
        print("Initialized a new Person object with "+
        "firstName = $firstName and lastName = $lastName")
    }

    //Member secondary Constructor
    constructor(firstName: String, lastName: String, age: Int):this(firstName,lastName){//this means that the fname and lname should come from the names passed to the class
        this.age = age//this means that the age passed in the constructor should be equal to the age of the age created in the member variables
        println("Initialized a new Person object with "+
                "firstName = $firstName and lastName = $lastName and age $age")
    }

    //Member functions - Methods
    fun stateHobby(){
        println("$firstName\'s hobby is $hobby")
    }
}