package oop_00000113941_NaomiPatriciaLeandru.Week09

fun main(){
    println("=== TEST LIST ===")
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    println("Immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")

    println("\n === TEST SET ===")
    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("Unique Numbers (Set): $uniqueNumbers")

    val activerUsers = mutableSetOf("UserA", "UserB")
    activerUsers.add("UserC")
    activerUsers.add("UserA") 
    println("Active Users: $activerUsers")

    println("\n === TEST MAP ===")
    val studentGrades = mapOf(
        "Alice" to "A",
        "Bob" to "B",
        "Charlie" to "A"
    )
    println("Nilai Bob: ${studentGrades["Bob"]}")

    val inverntory = mutableMapOf("Apples" to 50, "Bananas" to 30)
    inverntory["Oranges"] = 20
    inverntory["Apples"] = 45
    println("Inventory: $inverntory")
}