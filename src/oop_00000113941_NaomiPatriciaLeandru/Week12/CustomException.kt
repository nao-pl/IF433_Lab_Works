package oop_00000113941_NaomiPatriciaLeandru.Week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")