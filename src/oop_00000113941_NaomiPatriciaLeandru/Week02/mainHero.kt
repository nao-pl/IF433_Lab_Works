package oop_00000113941_NaomiPatriciaLeandru.Week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    
    print("Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Base Damage Hero: ")
    val baseDamage = scanner.nextInt()
    
    val hero = Hero(heroName, baseDamage = baseDamage)

    println("Hero sudah dibuat: ${hero.name}, Base Damage: ${hero.baseDamage}")
    println("\n --- Battle Start ---")

    var enemyHp = 100

    while(hero.isAlive() && enemyHp > 0){
        println("1. Serang")
        println("2. Minggat")
        print("Pilih aksi: ")
        val choice = scanner.nextInt()

        when (choice){
            1 -> {
                hero.attack("Musuh")

                enemyHp -= hero.baseDamage
                if (enemyHp < 0) enemyHp = 0

                println("Sisa HP Musuh: $enemyHp")

                if (enemyHp > 0) {
                    val enemyDamage = (10..20).random()
                    println("Musuh membalas sebesar $enemyDamage damage!")

                    hero.takeDamage(enemyDamage)
                    println("Sisa HP Hero: ${hero.hp}")
                }
            }
            2 -> {
                println("${hero.name} minggat dari pertempuran!")
                break   
            } else -> {
                println("Pilihan tidak valid ya tolong lah")
            }
        }
    }
    println("Hasil Pertarungan: ")
    if (hero.hp > 0 && enemyHp == 0) {
        println("${hero.name} MENANG! YEAHHH")
        } else if (hero.hp == 0) {
            println("Kamu Kalah awokawkoawok")
        } else {
            println("Kok bisa seri sih?")
    }
}
