package oop_00000113941_NaomiPatriciaLeandru.Week06

class Smartphone : Camera, Phone{
    override fun turnOn(){
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem operasi Smartphone berhasil booting.")
    }
}