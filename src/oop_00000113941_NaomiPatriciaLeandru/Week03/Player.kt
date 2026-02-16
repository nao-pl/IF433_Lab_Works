package oop_naomi_patricia_leandru.Week03

class Player(val username: String){
    private var xp: Int = 0

    val level: Int 
        get() = (xp / 100) + 1
    
    fun addXp(amount: Int){
        if(amount <= 0) return 

        val oldLevel = level 
        xp += amount 
        val newLevel = level 

        if(newLevel > oldLevel){
            println("Level up! $username naik ke level $newLevel")
        }
    }
}