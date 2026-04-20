package oop_00000113941_NaomiPatriciaLeandru.Week09

fun main(){
    val tradeHistory = listOf(
        TradeLog("BTC/USDT", "Long", 10, 15.5, "Closed"),
        TradeLog("ETH/USDT", "Short", 5, -8.2, "Closed"),
        TradeLog("XRP/USDT", "Long", 20, 25.0, "Open"),
        TradeLog("ADA/USDT", "Short", 15, -12.3, "Closed"),
        TradeLog("SOL/USDT", "Long", 8, 10.0, "Closed"),
        TradeLog("DOT/USDT", "Short", 12, -5.0, "Closed")
    )

    println("=== ALL TRADES ===")
    val closedTrades = tradeHistory.filter { it.status == "Closed" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformerString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position.uppercase()}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val worstPerformingString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position.uppercase()}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }
}