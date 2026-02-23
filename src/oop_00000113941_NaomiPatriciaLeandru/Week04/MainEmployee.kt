package oop_00000113941_NaomiPatriciaLeandru.Week04

fun main(){
    val manager = Manager("Lisa", 10000000)
    val developer = Developer("Monthy", 7000000, "Kotlin")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}
