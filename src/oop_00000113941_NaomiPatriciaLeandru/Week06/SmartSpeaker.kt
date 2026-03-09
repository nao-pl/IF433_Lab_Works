package oop_00000113941_NaomiPatriciaLeandru.Week06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable{
    override fun turnOn(){
        println("The Smart Speaker has been activated")
    }

    override fun turnOff(){
        println("The smart Speaker has been terminated")
    }
    
    fun playMusic(song: String){
        println("Memutar lagu $song dari Spotify")
    }
}