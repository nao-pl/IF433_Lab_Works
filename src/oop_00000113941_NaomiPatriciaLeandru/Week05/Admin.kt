package oop_00000113941_NaomiPatriciaLeandru.Week05

class Admin(nama: String) : Pegawai(nama){
    override fun bekerja(){
        println("[$nama] sedang duduk di depan komputer melayani administrasi.")
    }

    fun doAdminWork(){
        println("[$nama] sedang merekap data absensi mahasiswa.")
    }
}