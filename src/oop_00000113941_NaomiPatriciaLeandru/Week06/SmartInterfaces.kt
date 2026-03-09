package oop_00000113941_NaomiPatriciaLeandru.Week06

interface SmartDevice{
    val id: String
    val name: String
}

interface Switchable{
    fun turnOn()
    fun turnOff()
}

interface Recordable{
    fun startRecord()
    fun stopRecord(){
        println("The recording has stopped and is saving to Cloud")
    }
}