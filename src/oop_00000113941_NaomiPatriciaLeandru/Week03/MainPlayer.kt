package oop_00000113941_NaomiPatriciaLeandru.Week03

fun main(){
    val player = Player("Lesley")

    player.addXp(50)
    println("Level sekarang: ${player.level}")

    player.addXp(60)
    println("Level sekarang: ${player.level}")
}