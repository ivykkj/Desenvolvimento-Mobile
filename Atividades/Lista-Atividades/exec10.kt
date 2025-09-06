/*Faça um programa em kotlin que leia a largura e altura de uma parede, calcule e
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.*/
fun main() {
    println("digite a largura da parede:")
    var largura: Double = readln().toDouble()
    println("digite a altura da parede:")
    var altura: Double = readln().toDouble()
    var x = 2.0
    var area = (largura * altura)
    println("área a ser pintada: ${area}")
    println("o total de tinta gasta para pintar essa area é igual a ${area/x} litros")
}
