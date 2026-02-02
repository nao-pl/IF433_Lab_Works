package oop_00000113941_NaomiPatriciaLeandru.week01

fun main(){
    val gameTitle: String = "Counter Strike"
    val price: Int = 300_000
    val userNote: String? = null

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun calculateDiscount(price: Int): Int =
    if(price > 500_000) (price * 20) / 100 
    else(price * 10) / 100

fun printReceipt(title: String, finalPrice: Int, note: String?){
    println("Judul Game  : $title")
    println("Harga Akhir : Rp $finalPrice")
    println("Catatan     : ${note ?: "Tidak ada catatan"}")
}