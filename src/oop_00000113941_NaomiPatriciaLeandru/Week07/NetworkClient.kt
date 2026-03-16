package oop_00000113941_NaomiPatriciaLeandru.Week07

class NetworkClient private constructor(val url: String){
    fun connect(){
        println("Connecting to $url...")
    }
}