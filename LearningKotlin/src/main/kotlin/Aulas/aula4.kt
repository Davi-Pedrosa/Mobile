fun main() {
    var arroz:Produtos = Produtos()
    var feijao:Produtos = Produtos()

    print("Digite o preço do arroz: ")
    var entrada:String = readln();
    arroz.setPreco(entrada.toDouble())

    print("Digite o preço do feijão: ")
    entrada = readln()
    feijao.setPreco(entrada.toDouble())

    println("O preço do arroz é: R$ ${arroz.getPreco()}")
    println()
}

class Produtos{
    var codigo = 0
    var nome:String = ""
    var quantidade:Int =0
    private var preco:Double = 0.0

    fun setPreco(p: Double){
        preco = p
    }

    fun getPreco():Double{
    return peso
    }

}

