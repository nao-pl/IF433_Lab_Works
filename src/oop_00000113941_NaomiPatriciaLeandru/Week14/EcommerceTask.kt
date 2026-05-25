package oop_00000113941_NaomiPatriciaLeandru.Week14
import java.io.File
import java.io.FileWriter

interface OrderRepository{
    fun saveOrder(
        itemName: String,
        finalPrice: Double, 
        customerType: String
    )
}

class CsvOrderRepository: OrderRepository{
    private val file = File("orders.csv")

    override fun saveOrder(
        itemName: String,
        finalPrice: Double,
        customerType: String
    ){
        FileWriter(file, true).use { writer ->
            writer.write("$itemName,$finalPrice,$customerType\n")
        }
    }
}

interface NotificationService{
    fun sendNotification(message: String)
}

class EmailNotifier: NotificationService{
    override fun sendNotification(message: String){
        println("Email is sent: $message")
    }
}

interface PricingStrategy{
    fun calculate(price: Double): Double
}

class RegularPricing: PricingStrategy{
    override fun calculate(price: Double): Double{
        return price
    }
}

class VipPricing: PricingStrategy{
    override fun calculate(price: Double): Double{
        return price * 0.90
    }
}

class SafeOrderProcessor(
    val repo: OrderRepository,
    val notifier: NotificationService
){
    fun processOrder(
        itemName: String,
        basePrice: Double,
        pricing: PricingStrategy
    ){
        val finalPrice = pricing.calculate(basePrice)

        println("Processing order for $itemName with the price of $finalPrice")

        repo.saveOrder(itemName, finalPrice, "CUSTOM")

        notifier.sendNotification("Order for $itemName processed")
    }
}

//for checking if my code works or not 
fun main(){

    val repo = CsvOrderRepository()
    val notifier = EmailNotifier()

    val processor = SafeOrderProcessor(
        repo,
        notifier
    )

    processor.processOrder(
        "Laptop",
        10000000.0,
        VipPricing()
    )

    processor.processOrder(
        "Mouse",
        500000.0,
        RegularPricing()
    )
}