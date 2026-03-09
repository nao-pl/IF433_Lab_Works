package oop_00000113941_NaomiPatriciaLeandru.Week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable{
    override fun turnOn(){
        println("The Smart CCTV has been activated")
        startRecord()
    }

    override fun turnOff(){
        println("The smart CCTV has been terminated")
        stopRecord()
    }

    override fun startRecord(){
        println("CCTV is recording")
    }
}