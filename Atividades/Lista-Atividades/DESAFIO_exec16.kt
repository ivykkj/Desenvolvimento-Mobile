/*[DESAFIO] Escreva um programa em kotlin para calcular a redução do tempo de vida
de um fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos
ele já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
quantos dias de vida um fumante perderá e exiba o total em dias.*/
fun main() {
  println("insira a quantos anos você fuma:")
  var anos: Double = readln().toDouble() 
  println("insira a quantidade de cigarros que fuma ao dia:") 
  var qtd: Int = readln().toInt() 
  var totalcigas = (anos*365)*qtd 
  var perda = (totalcigas*10)/1440 
  println("você perdeu aproximadamente ${String.format("%.2f",perda)} dias de vida") 
}
