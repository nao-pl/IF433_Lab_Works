package oop_00000113941_NaomiPatriciaLeandru.Week06

class Smartwatch : Watch(), BluetoothConnectable, Rechargeable{
    override fun showTime(){
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun connectToBluetooth(){
        println("Mencari perangkat HP di sekitar untuk pairing...")
    }
    
    override fun chargeBattery(){
        println("Mingisi daya menggunakan charger magnetik 15W.")
    }
}