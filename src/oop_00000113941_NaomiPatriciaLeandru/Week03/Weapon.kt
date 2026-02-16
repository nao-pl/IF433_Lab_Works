package oop_00000113941_NaomiPatriciaLeandru.Week03

class Weapon(val name: String){
    var damage: Int = 0
        set(value){
            when{
                value < 0 -> {
                    println("ERROR: Damage tidak boleh negatif!")
                    field = 0
                }
                value > 1000 -> {
                    println("ERROR: Damage tidak boleh lebih dari 100!")
                    field = 1000
                }
                else -> {
                    field = value
                }
            }
        }
    val tier: String 
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}


