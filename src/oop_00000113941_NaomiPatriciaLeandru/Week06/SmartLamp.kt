package oop_00000113941_NaomiPatriciaLeandru.Week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable{
    override fun turnOn(){
        println("The Smart Lamp has been activated")
    }

    override fun turnOff(){
        println("The smart Lamp has been terminated")
    }
}