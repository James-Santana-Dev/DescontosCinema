fun main(args: Array<String>) {
    print("Digite a sua idade ")

    var idade = readLine()!!.toInt()

    var precoIngresso = 18.0
    var desconto = 0.0
    var precoFinal = 0.0
    var contador = 0

    if(idade < 5){
        desconto = 0.6
    }else if(idade > 60){
        desconto = 0.55
    }else{
        print("Quantos ingressos você deseja comprar: ")
        contador = readLine()!!.toInt()

        if(contador >= 2){
            desconto = 0.3
        }else{
            desconto = 0.0
        }
    }

    precoFinal = precoIngresso - (precoIngresso * desconto)

    println("Você pagará R$$precoFinal em cada ingresso")
}