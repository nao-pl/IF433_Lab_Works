package oop_00000113941_NaomiPatriciaLeandru.Week10

class WalletRepository<T>{
    private val items = mutableListOf<T>()

    fun addItem(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }
}



