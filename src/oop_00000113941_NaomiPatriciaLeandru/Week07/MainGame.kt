package oop_00000113941_NaomiPatriciaLeandru.Week07

fun main(){
    GameManager.startGame()
    GameManager.startGame()

    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterWeapon = Weapon.forgeStarterSword()

    println("Senjata awal kamu:")
    println("Nama: ${starterWeapon.item.name}")
    println("Damage: ${starterWeapon.item.damage}")
    println("Rarity: ${starterWeapon.item.rarity}")
    println("Durability: ${starterWeapon.durability}")

    val upgradedItem = starterWeapon.item.copy(damage = 25)

    println("\nBaru ke BlackSmith ya? Nih Weapon kamu")
    println("Nama: ${upgradedItem.name}")
    println("Damage: ${upgradedItem.damage}")
    println("Rarity: ${upgradedItem.rarity}")

    println("\n=== SIMULASI EVENT ===")

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Gblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}