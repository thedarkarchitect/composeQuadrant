package com.example.kotlinbasics

//fun main(){
//    print("hello world!")
//}

fun main(args : Array<String>) {
    var myName = "Denis"
    println("Hello, $myName and the length of name is ${myName.length} ")
    //this is called string templation by using "$" to write expression and and variables into strings
    //as kotlin prefers.
    operators()
    ageComparison()
    whileChallenge()
}

fun operators(){
    var result =  5 + 3
    var a = 5.0
    var b = 3
    //this will return the result of the expression below to int since when variable result is declared it is already an int
    result = (a / b).toInt()
    print(result)
}

fun comparison(){
    var heightPerson1 = 170
    var heightPerson2 = 189

    if(heightPerson1 > heightPerson2){
        println("use raw force")
    }else if(heightPerson1 == heightPerson2){
        println("use your power technique 1447")
    }else{
        println("use technique")
    }
}


fun ageComparison(){
    var myAge = 32

    if(myAge >= 21){
        println("You may drink in the US")
    }else if(myAge >= 18){
        println("You may vote")
    }else if (myAge >= 16){
        println("You may drive")
    }else{
        println("You are too young")
    }
}

fun whenExpression(){
    var season = 3
    when (season){
        1 -> println("Spring")
        2 -> println("Summer")
        3->{//multiline expression
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3
    when (month){
        // checking multiple numbers or range of values
        //a range of month are consider using the key word in
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12,1,2 -> println("Winter") // consider specific months
        else -> println("Invalid Season")
    }

    var x : Any = 13.37f
    when (x){
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }
}

fun whenChallenge(){
    var age = 12
    when (age){
        in 16..17 -> println("You may drive now")
        in 18..20 -> println("You may vote now")
        in 21..100 -> println("You may drink in the US")
        else -> println("You're too young")
    }
}

fun whileloop(){
    var x =1
    while(x <= 10){
        println("$x")
        x++
    }
}

fun whileChallenge(){
    var num = 100
    while (num >= 2){
        if (num % 2 == 0){
            println(num)
        }
        num--
    }
}

fun forloop(){
    for(num in 1..10){
        print("$num")
    }
    //OR
    for (i in 1 until 10){//here we use the keyword "untill"
        print("$i")
    }

    for (m in 10 downTo 1 step 2){//here we use the keyword "downTO" and "step" so skip every two digits
        //same as -- for(m in 10.downT0(1).step(2))
        print("$m")
    }
}
