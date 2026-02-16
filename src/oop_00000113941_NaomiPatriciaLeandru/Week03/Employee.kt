package oop_00000113941_NaomiPatriciaLeandru.Week03

class Employee(val name: String){
    var salary: Int = 0
        set(value){
            println("Mencoba set gaji ke: $value")  
            this.salary=value      
        }
}