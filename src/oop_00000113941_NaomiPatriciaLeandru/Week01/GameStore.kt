package oop_00000113941_NaomiPatriciaLeandru.week01

fun main(){
    val gameTitle: String = "Counter Strike"
    val price: Int = 300_000
}

fun calculateDiscount(price: Int): Int =
    if(price > 500_000) (price * 20) / 100 
    else(price * 10) / 100

fun printReceipt(title: String, finalPrice: Int){
    println("Judul Game  : $title")
    println("Harga Akhir : Rp $finalPrice")
}