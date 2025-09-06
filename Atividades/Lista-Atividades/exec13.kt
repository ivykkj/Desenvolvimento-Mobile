/*Faça um programa em kotlin que leia o salário de um funcionário, calcule e mostre o
seu novo salário, com 15% de aumento.*/
fun main() {
    println("insira o valor do salário:")
    var salario: Float = readln().toFloat()
    println("o salário com aumento é: ${salario + (salario*0.15)}")
}
