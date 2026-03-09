package oop_00000113941_NaomiPatriciaLeandru.Week06

interface PaymentMethod{
    fun pay(amount: Double)
}

class Gopay : PaymentMethod{
    override fun pay(amount: Double){
        println("Processing Rp$amount via Gopay Server")
    }
}

class CreditCard : PaymentMethod{
    override fun pay(amount: Double){
        println("Contracting Bank for Rp$amount")
    }
}