package oop_00000113941_NaomiPatriciaLeandru.Week08

class City(val name: String)
class Address(val city: City?)
class DeliveryDetails(val address: Address?)
class Order(val delliveryDetails: DeliveryDetails?, val totalPrice: Int?)