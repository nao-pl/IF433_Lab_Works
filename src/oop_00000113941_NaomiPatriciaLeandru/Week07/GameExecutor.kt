package oop_00000113941_NaomiPatriciaLeandru.Week07

fun processEvent(event: BattleState){
    when(event){
        is BattleState.MonsterEncounter -> println("Kamu bertemu dengan monster: ${event.monsterName}! Semangat ya")
        is BattleState.LootDropped -> println("Kamu mendapatkan loot: ${event.item.name} (${event.item.rarity})! WOW")
        is BattleState.GameOver -> println("Game Over! Alasan: ${event.reason}... Itulah hidup")
        BattleState.SafeZone -> println("Kamu berada di zona aman. Istirahatlah sejenak Traveler.")
    }
}