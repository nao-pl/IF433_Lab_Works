package oop_00000113941_NaomiPatriciaLeandru.Week14
import java.io.File

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
        file.bufferedWriter().use { writer ->
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

class SafeOrderProcessor(
    val repo: OrderRepository,
    val notifier: NotificationService
){
    fun processOrder(
        itemName: String,
        basePrice: Double,
        customerType: String
    ){
        val finalPrice = when(customerType){
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        println("Processing order for $itemName with the price of $finalPrice")

        repo.saveOrder(itemName, finalPrice, customerType)

        notifier.sendNotification("Order for $itemName processed")
    }
}