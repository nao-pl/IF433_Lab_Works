package oop_00000113941_NaomiPatriciaLeandru.Week10

fun main(){
    val coinRepo = WalletRepository<Coin>()
    coinRepo.addItem(Coin("BTC", 2.5))
    coinRepo.addItem(Coin("ETH", 5.0))
    coinRepo.addItem(Coin("USDT", 10.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")

    response.data.forEach { coin ->
        println("Coin: ${coin.name}, Balance: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.addItem(Transaction("tx123", 0.5))
}