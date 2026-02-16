package oop_00000113941_NaomiPatriciaLeandru.Week03

fun main(){
    val weapon = Weapon("Malific Gun")

    weapon.damage = -50 
    weapon.damage = 9999 

    println("Weapon: ${weapon.name}, Damage: ${weapon.damage}, Tier: ${weapon.tier}")
}