package oop_00000113941_NaomiPatriciaLeandru.Week04

fun main(){
    println("--- Testing Vehicle ---")
    val generalVehicle = vehicle("Honda")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()
}