package oop_00000113941_NaomiPatriciaLeandru.Week07

class Weapon private constructor(val item: GameItem, val durability: Int){
    companion object{
        fun forgeStarterSword(): Weapon{
            return Weapon(item = GameItem(name = "Pedang Kayu Bapuk", damage = 5, rarity = ItemRarity.COMMON), durability = 50)
        }

        fun forgeEpicSword(): Weapon{
            return Weapon(item = GameItem(name = "Pedang Listrik Keren", damage = 20, rarity = ItemRarity.EPIC), durability = 100)
        }
    }
}