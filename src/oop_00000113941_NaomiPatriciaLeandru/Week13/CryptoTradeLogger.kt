package oop_00000113941_NaomiPatriciaLeandru.Week13
import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String, 
    val type: String, 
    val margin: Double, 
    val pnl: Double
)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord?{
    return try{
        val parts = line.split(",")

        if(parts.size == 5){
            TradeRecord(parts[0].toInt(), parts[1], parts[2], parts[3].toDouble(), parts[4].toDouble())
        }else{
            null
        }
    }catch(e: Exception){
        println("Error parsing line: $line")
        null
    }
} 

fun saveTrades(trades: List<TradeRecord>, path: String){
    File(path).printWriter().use{ out ->
        trades.forEach{ 
            out.println(it.toCsv()) 
        }
    }
}

fun loadTrades(path: String): List<TradeRecord>{
    return try{
        File(path).readLines().mapNotNull{
            fromCsvTrade(it)
        }
    }catch(e: FileNotFoundException){
        println("File not found: $path")
        emptyList()
    }
}

fun main(){
    val trades = listOf(
        TradeRecord(1, "BTCUSD", "LONG", 1000.0, 150.0),
        TradeRecord(2, "ETHUSD", "SHORT", 500.0, -50.0),
        TradeRecord(3, "XRPUSD", "LONG", 200.0, 20.0)
    )
    saveTrades(trades, "crypto_trades.csv")

    File("crypto_trades.csv").appendText("CORRUPT_ID, DOGEUSD, Hoid, XX, YY\n")
}