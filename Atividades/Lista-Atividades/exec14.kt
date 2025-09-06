/*A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um
programa em kotlin que pergunte a quantidade de Km percorridos por um carro alugado
e a quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
sabendo que o carro custa R$ 90,00 por dia e R$ 0,20 por Km rodado.*/
fun main() {
  println("insira o total de quilometros percorridos: ")
  var km: Double = readln().toDouble()
  println("insira a quantidade de dias de aluguel: ")
  var dias: Int = readln().toInt()
  var total = (90*dias)+(0.2*km)
  println("o total a ser pago é: ${total}")
}
