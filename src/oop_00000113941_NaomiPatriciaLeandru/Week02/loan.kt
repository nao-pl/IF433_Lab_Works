package oop_00000113941_NaomiPatriciaLeandru.Week02

class Loan(val bookTitle: String, val borrower: String, val loanDuration: Int){
    fun calFine(): Int{
        return if(loanDuration > 3){
            (loanDuration - 3) * 2000
        } else{
            0
        }
    }
}

fun main(){
    val loan1 = Loan("Laut Bercerita", "Sora", 4)
    val loan2 = Loan("Believe Me", "Floryn", 2)

    println("Book: ${loan1.bookTitle}, Borrower: ${loan1.borrower}, Duration: ${loan1.loanDuration} days, Fine: ${loan1.calFine()}")
    println("Book: ${loan2.bookTitle}, Borrower: ${loan2.borrower}, Duration: ${loan2.loanDuration} days, Fine: ${loan2.calFine()}")
}