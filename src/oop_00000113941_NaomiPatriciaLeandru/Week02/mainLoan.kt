package oop_00000113941_NaomiPatriciaLeandru.Week02

import java.util.Scanner 

fun main(){
    val scanner = Scanner(System.`in`)

    print("Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (dalam hari): ")
    var loanDuration = scanner.nextInt()

    if(loanDuration < 1){
        println("Lama pinjam harus minimal 1 hari.")
        loanDuration = 1
    } else {
        val loan = Loan(bookTitle, borrower, loanDuration)
        println("Denda: Rp${loan.calFine()}")
    }
}