package oop_00000113941_NaomiPatriciaLeandru.Week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName){

    override fun processPayment(amount: Double){
        if (balance >= amount){
            balance -= amount
            println("Payment of $$amount processed. Remaining balance: $$balance")
        } else{
            println("Insufficient balance to process the payment.")
        }
    }

    fun topUp(amount: Double){
        balance += amount
        println("Top-up of $$amount successful. New balance: $$balance")
    }
}