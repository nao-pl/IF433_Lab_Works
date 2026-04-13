package oop_00000113941_NaomiPatriciaLeandru.Week08

class ApiParser{
    fun parseProduct(rawJson: Map<String, Any?>): Product?{
        val id = requireNotNull(rawJson["id"] as? String){
            "API Invalid: Missing ID"
        }

        val name = requireNotNull(rawJson["name"] as? String){
            "API Invalid: Missing Name"
        }

        val type = rawJson["type"] as? String ?: return null
        return when (type.uppercase()){
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Product.Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Product.Clothing(id, name, size)
            }
            else -> null
        }
    }

    fun checkout(product: Product): String{
    val id = when (product){
        is Product.Electronic -> product.id
        is Product.Clothing -> product.id
    }

    val trxId = JavaPaymentService.processPayment(id)!!
    return "Payment Success! Transaction ID: $trxId"
}
}
