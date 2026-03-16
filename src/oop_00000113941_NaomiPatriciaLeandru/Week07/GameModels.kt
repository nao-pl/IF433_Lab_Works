package oop_00000113941_NaomiPatriciaLeandru.Week07

enum class ItemRarity {
    COMMON, UNCOMMON, RARE, EPIC, LEGENDARY;

    val dropChance: Int
        get() = when(this){
            COMMON -> 50
            UNCOMMON -> 30
            RARE -> 15
            EPIC -> 4
            LEGENDARY -> 1
        }
    }

data class GameItem(val name: String, val damage: Int, val rarity: ItemRarity)

