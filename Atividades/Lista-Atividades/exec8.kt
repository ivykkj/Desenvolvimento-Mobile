/*Desenvolva um programa em Kotlin que leia uma distância em metros e mostre os
valores relativos em outras medidas.
Ex:
Digite uma distância em metros: 100
Distância de 10000 Cm*/
fun main() {
    println("Digite uma distância em metros: ")
    val dist: Double = readln().toDouble()
    println("Distância de ${dist * 100} cm")
    println("Distância de ${dist * 1000} mm")
    println("Distância de ${dist / 1000} km")
}
