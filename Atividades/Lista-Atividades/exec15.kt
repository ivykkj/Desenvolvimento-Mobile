/*Crie um programa kotlin que leia o número de dias trabalhados em um mês e mostre o
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por
hora trabalhada.*/
fun main() {
  println("digite o total de dias trabalhados no mês")
  var dias: Int = readln().toInt()
  var salario = (8*dias)*25.00
  println("o salario do funcionario no mês é: ${salario} reais")
}
