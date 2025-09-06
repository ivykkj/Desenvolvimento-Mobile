/*Faça um programa em Kotlin que leia um número inteiro e mostre o seu antecessor e seu
sucessor.
Ex:
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10*/
fun main(){
   println("Digite um número: ")
   var num: Int = readln().toInt()
   println("O antecessor de ${num} é ${num - 1}")
   println("O sucessor de ${num} é ${num + 1}")
}
