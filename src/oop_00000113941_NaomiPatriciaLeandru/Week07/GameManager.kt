package oop_00000113941_NaomiPatriciaLeandru.Week07

object GameManager {
    var isGameRunning: Boolean = false
    
    fun startGame(){
        if (isGameRunning){
            println("Game sudah berjalan! Mencegah instansiasi ganda.")
        }else{
            println("Memulai Game Engine...")
            isGameRunning = true 
        }
    }
}