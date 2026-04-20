package oop_00000113941_NaomiPatriciaLeandru.Week09

data class Student(val name: String, val gpa: Double)

fun main(){
    val students = listOf(
        Student("Andi", 3.2),
        Student("Budi", 3.9),
        Student("Citra", 32.8),
        Student("Dewi", 3.7)
    )

    println("=== HONOR STUDENTS PIPELINE")

    val honorName = students
        .filter { it.gpa >= 3.5 }
        .sortedBy { it.name }
        .map { it.name.uppercase() }

    honorName.forEach { println("Honor Roll: $it") }
}