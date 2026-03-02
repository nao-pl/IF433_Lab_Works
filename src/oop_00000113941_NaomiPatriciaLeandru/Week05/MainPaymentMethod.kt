package oop_00000113941_NaomiPatriciaLeandru.Week05

fun main() {

    val eWallet = EWallet("Layla", 50000.0)
    val creditCard = CreditCard("Layla", 100000.0)

    val paymentMethods: List<PaymentMethod> = listOf(eWallet, creditCard)

    for (payment in paymentMethods) {

        payment.processPayment(75000.0)

        if (payment is EWallet) {
            payment.topUp(50000.0)       
            payment.processPayment(75000.0) 
        }
    }
}
