package oop_00000113941_NaomiPatriciaLeandru.Week02

class Hero(val name: String, var hp: Int = 100, val baseDamage: Int){
    fun attack(targetName: String){
        println("$name menyerang $targetName!")
    }
    fun takeDamage(damage: Int){
        hp -= damage
        if(hp < 0) hp = 0
    }
    fun isAlive(): Boolean{
        return hp > 0
    }
}