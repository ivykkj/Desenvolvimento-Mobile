/*Faça um programa em Kotlin que leia quanto dinheiro uma pessoa tem na carteira (em
R$) e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45. (ou
cotação atual)*/
fun main() {
    println("digite um valor:")
    var valor: Double = readln().toDouble()
    val cotacao = 5.41
    println("você consegue comprar ${valor/cotacao} dólares")
}
