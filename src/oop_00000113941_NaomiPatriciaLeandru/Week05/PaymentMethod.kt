package oop_00000113941_NaomiPatriciaLeandru.Week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}