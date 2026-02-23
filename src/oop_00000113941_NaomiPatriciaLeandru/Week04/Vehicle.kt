package oop_00000113941_NaomiPatriciaLeandru.Week04

open class vehicle(val brand: String){
    var speed: Int = 0 

    open fun accelerate(){
        speed += 10
        println("$brand melaju. Kecepatan: $speed km/jam")
    }

    open fun honk(){
        println("Beep beep!")
    }
}