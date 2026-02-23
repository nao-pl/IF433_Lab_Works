package oop_00000113941_NaomiPatriciaLeandru.Week04

open class Employee(val name: String, val baseSalary: Int){
    open fun work(){
        println("$name sedang bekerja")
    }

    open fun calculateBonus(): Int{
        return (baseSalary * 0.1).toInt()
    }
}