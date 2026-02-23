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

open class Car(brand: String, val numberOfDoors: Int) : vehicle(brand){
    fun openTrunk(){
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    override fun honk(){
        println("TIN TIN! Mobil $brand lewat!")
    }
}
