package oop_00000113941_NaomiPatriciaLeandru.Week05

fun main(){
    val EWallet = EWallet("Layla", 50000.0)
    val creditCard = CreditCard("Layla", 100000.0)

    val paymentAmount: List<PaymentMethod> = listOf(EWallet, creditCard)

    for(payment in paymentAmount){
        payment.processPayment(75000.0)
    }
}