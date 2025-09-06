/*Desenvolva uma programa em kotlin que leia os valores de A, B e C de uma
equação do segundo grau e mostre o valor de Delta. (formula Δ = b
2 – 4ac).*/
fun main() {
    println("Insira o valor 'a' da equação do segundo grau: ")
    var a:Float = readln().toFloat()
    println("Insira o valor 'b' da equação do segundo grau: ")
    var b:Float = readln().toFloat()
    println("Insira o valor 'c' da equação do segundo grau: ")
    var c:Float = readln().toFloat()
    println(delta(a, b, c))
}
fun delta(a: Float, b: Float, c: Float) : Float {
    return ((b*b) - 4 * (a*c))
}
