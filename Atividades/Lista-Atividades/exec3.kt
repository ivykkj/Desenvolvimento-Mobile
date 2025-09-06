/*Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma
mensagem.
Ex:
Nome do Funcionário: Maria do Carmo Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em junho.*/
fun main() {
    println("nome do funcionário")
    var nome = readLine()
    println("salário do funcionário:")
    var salario: Double = readln().toDouble()
    println("o funcionário ${nome} tem um salário de R$${String.format("%.2f", salario} em junho")
}
