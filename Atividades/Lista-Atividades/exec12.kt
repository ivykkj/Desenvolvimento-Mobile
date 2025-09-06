/*Crie um programa em Kotlin que leia o preço de um produto, calcule e mostre o
seu PREÇO PROMOCIONAL, com 5% de desconto.*/
fun main() {
    println("insira o valor do produto:")
    var valor: Double = readln().toDouble()
    println("valor com desconto: ${valor*0.95}")
}
