package oop_00000113941_NaomiPatriciaLeandru

fun main(){
	val name: String = "Naomi Patricia Leandru"
	val score: Int = 90

	println("Nama: $name, Nilai: $score")

	val grade = when (score){
		in 90 .. 100 -> "A"
		in 80 .. 89 -> "B"
		in 70 .. 79 -> "C"
		else -> "D"
	}

	println("Grade kamu: $grade")
	println("Status: ${calculateStatus(score)}")
}

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"