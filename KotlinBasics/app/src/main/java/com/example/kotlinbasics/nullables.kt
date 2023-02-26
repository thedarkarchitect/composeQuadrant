package com.example.kotlinbasics

//working with nullables

fun main(){
//    var name : String = "Denis"
    //name = null -> Compilation Error
    var nullableName : String? = "Denis"
//    nullableName = null

   //var len = name.length //this will show a result
    //but for the nullableName

    //old fashion
//    if(nullableName != null){ // check to see if the variable value was not set to null
//        var len2 = nullableName.length
//    }else{ //if the above can't be done return null
//        null
//    }

    //new fashion
    var len2 = nullableName?.length

    // the two fashion are the same but the new fashion is shorter and more friendly
    print(len2)
    //if not null then code below will work
    nullableName?.let{ println(it.length)}

    //elvis Operator
    val name = nullableName ?: "Guest" //this name variable is set to a default value Guest only if nullableName is empty
    print("name is $name")

}
