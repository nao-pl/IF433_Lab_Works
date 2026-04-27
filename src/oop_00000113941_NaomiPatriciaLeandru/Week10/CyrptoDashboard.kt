package oop_00000113941_NaomiPatriciaLeandru.Week10

fun main(){
    val coinRepo = WalletRepository<Coin>()
    coinRepo.addItem(Coin("BTC", 2.5))
    coinRepo.addItem(Coin("ETH", 5.0))
    coinRepo.addItem(Coin("USDT", 10.0))
}