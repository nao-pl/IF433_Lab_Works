package oop_00000113941_NaomiPatriciaLeandru.Week04

class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int) : Car(brand, numberOfDoors){

    final override fun accelerate() {
        speed += 10
        println("$brand berakselerasi diem-diem. Kapasitas baterai: $batteryCapacity%")
    }
}
