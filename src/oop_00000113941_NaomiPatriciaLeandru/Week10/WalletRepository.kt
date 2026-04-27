package oop_00000113941_NaomiPatriciaLeandru.Week10

class WalletRepository<T>{
    private val items = mutableListOf<T>()

    fun addItem(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun searchByName(name: String): List<T> {
        return items.filter{ 
            when (it){
                is Coin -> it.name.contains(name, ignoreCase = true)
                is Transaction -> it.id.contains(name, ignoreCase = true)
                else -> false
            }
        }
    }
}
