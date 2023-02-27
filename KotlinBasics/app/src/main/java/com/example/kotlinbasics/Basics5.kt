package com.example.kotlinbasics

//interface
interface Drivable{
    val maxSpeed: Double
    fun drive():String
    fun brake(){
        println("The drivable is braking")
    }
}

//child class of Vehicle
open class Vehicle(override val maxSpeed: Double, val name: String, val brand: String): Drivable {
    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if(amount > 0)
            range += amount
    }

    //shorter fun of what is bellow
    //override fun drive(): String = "driving the interface drive"
    override fun drive():String{
        return "driving the interface drive"
    }

    open fun drive(distance: Double){
        println("Drove for $distance ")
    }

}

class ElectricCar(maxSpeed: Double, name: String, brand: String, batterLife: Double): Vehicle(maxSpeed, name, brand){//this is child class of Car class
    override var range = batterLife * 6
    var chargerType = "Type1"

    override fun drive(distance: Double){
        println("Drove for $distance KM on electricity")
    }

    override fun drive(): String{
        return "DROVE for $range KM on electricity"
    }

    override fun brake() {
        super.brake()
        println("brake inside of electric car")
    }
}

fun main(){
    var myCar = Vehicle(220.0,"A3", "Audi")
    var myECar = ElectricCar(240.0,"S-model", "Tesla", 90.0)

    myECar.extendRange(200.0)
    myECar.chargerType = "Type2"

    myECar.drive()
    myECar.brake()
    myCar.brake()

    //polymorphism
    myCar.drive(200.0)
    myECar.drive(200.0)

}