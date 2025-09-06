/*Desenvolva um programa em Kotlin que leia dois números inteiros e mostre o somatório
entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13.*/
fun main() {
    println("digite um número")
    var num1: Int = readln().toInt()
    println("digite outro número")
    var num2: Int = readln().toInt()
    var soma = (num1 + num2)
    println("a soma entre ${num1} e ${num2} é igual a ${soma}")
}
