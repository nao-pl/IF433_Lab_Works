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
