fun main() {

    println("========== HORA DE CODAR 1 ==========\n" +
            "Qual exercício deseja executar?\n" +
            "01 - Ex. Maior valor\n" +
            "02 - Ex. Valor positivo, negativo ou zero\n" +
            "03 - Ex. 3 valores e mostrar o maior deles\n" +
            "04 - Ex. Soma dos dois maiores valores\n" +
            "05 - Ex. Calcular a média aritmética de 6 valores\n" +
            "06 - Ex. Exibir somente o primeiro, o último e o maior de todos\n" +
            "07 - Ex. Valores inferior a 72 são somados\n" +
            "08 - Ex. Média de notas\n" +
            "09 - Ex. Ler o ano de nascimento e exibir a idade\n" +
            "10 - Ex. Calcular o peso ideal\n" +
            "11 - Ex. Calculadora\n" +
            "12 - Sair")
    var option = readLine()!!.toInt()

    while (option != 12) {
        when (option) {
            1 -> {
                ex01()
                break
            }

            2 -> {
                ex02()
                break
            }

            3 -> {
                ex03()
                break
            }

            4 -> {
                ex04()
                break
            }

            5 -> {
                ex05()
                break
            }

            6 -> {
                ex06()
                break
            }

            7 -> {
                ex07()
                break
            }

            8 -> {
                ex08()
                break
            }

            9 -> {
                ex09()
                break
            }

            10 -> {
                ex10()
                break
            }

            11 -> {
                ex11()
                break
            }
            12 -> {
                println("Encerrando programa...")
                break
            }

        }

    }

}

fun ex01 () {
    //Escreva um programa em que o usuário informe dois números. Então escreva em tela o maior deles.
    println("Informe um número inteiro:")
    val n1 = readLine()!!.toInt()
    println("Informe outro número inteiro:")
    val n2 = readLine()!!.toInt()

    if (n1 > n2) {
        println("O ${n1} é maior que o ${n2}.")
    } else if (n2 > n1) {
        println("O ${n2} é maior que ${n1}.")
    } else {
        println("Os números são iguais")
    }

    main()

}

fun ex02 () {
    //Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.
    println("Digite um número real:")
    val num = readLine()!!.toInt()

    if (num > 0) {
        println("O número ${num} é positivo.")
    } else if (num < 0) {
        println("O número ${num} é negativo.")
    } else {
        println("O número ${num} é zero.")
    }

    main()

}

fun ex03 () {
    //Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.
    println("Informe um valor:")
    val num1 = readLine()!!.toInt()
    println("Informe outro valor diferente:")
    val num2 = readLine()!!.toInt()
    println("Informe outro valor diferente:")
    val num3 = readLine()!!.toInt()

    if (num1 == num2 || num1 == num3 || num2 == num3) {
        println("ERRO: há valores iguais.")
    } else {
        if (num1 > num2 && num1 > num3) {
            println("O número ${num1} é o maior de todos.")
        } else if (num2 > num1 && num2 > num3) {
            println("O número ${num2} é o maior de todos.")
        } else {
            println("O número ${num3} é o maior de todos.")
        }
    }

    main()

}

fun ex04 () {
    //Faça um programa que leia 3 valores informados pelo usuário (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
    println("Informe um valor:")
    val num1 = readLine()!!.toInt()
    println("Informe outro valor diferente:")
    val num2 = readLine()!!.toInt()
    println("Informe outro valor diferente:")
    val num3 = readLine()!!.toInt()

    if (num1 == num2 || num1 == num3 || num2 == num3) {
        println("ERRO: há valores iguais.")
    } else {
        if (num1 < num2 && num1 < num3) { //num1 é o menor de todos
            val soma = num2 + num3
            println("A soma dos dois maiores valores (${num2} + ${num3}) é ${soma}")
        } else if (num2 < num1 && num2 < num3) { //num2 é o menor de todos
            val soma = num1 + num3
            println("A soma dos dois maiores valores (${num1} + ${num3}) é ${soma}")
        } else { //num3 é o menor de todos
            val soma = num1 + num2
            println("A soma dos dois maiores valores (${num1} + ${num2}) é ${soma}")
        }
    }

    main()

}

fun ex05 () {
    //Faça um programa que leia 6 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.
    var soma : Double = 0.0

    for (i in 1..6){
        println("Digite o ${i}ª valor:")
        var valores = readLine()!!.toDouble()
        soma += valores
    }
    val media = soma / 6
    println("A média aritmética dos seis valores é ${media}")

    main()

}

fun ex06 () {
    //Faça um programa que receba quatro valores informados pelo usuário, mas informe somente o primeiro, o último e o maior de todos eles (considere que todos os números informados serão diferentes)
    var maior : Int = 0

    println("Digite um número:")
    val num1 = readLine()!!.toInt()
    println("Digite outro número diferente:")
    val num2 = readLine()!!.toInt()
    println("Digite outro número diferente:")
    val num3 = readLine()!!.toInt()
    println("Digite outro número diferente:")
    val num4 = readLine()!!.toInt()

    if (num1 == num2 || num1 == num3 || num1 == num4 || num2 == num3 || num2 == num4 || num3 == num4) {
        println("ERRO: há valores iguais. Tente novamente!")
        return ex06()
    } else {
        if (num1 > num2 && num1 > num3 && num1 > num4) {
            maior = num1
        } else if (num2 > num1 && num2 > num3 && num2 > num4) {
            maior = num2
        } else if (num3 > num1 && num3 > num2 && num3 > num4) {
            maior = num3
        } else {
            maior = num4
        }
    }

    println("O primeiro valor informado pelo usuário é: ${num1} \nO último valor informado pelo usuário é: ${num4} \nE o maior valor de todos é ${maior}")

    main()

}

fun ex07 () {
    //Faça um programa que leia 6 números que o usuário vai informar. Todos os números lidos com valor inferior a 72 devem ser somados. Escreva o valor final da soma efetuada e também todos valores que o usuário informou.
    var valores = mutableListOf<Int>()
    var soma : Int = 0
    var concat : String = ""

    for (i in 1..6) {
        println("Digite o ${i}º valor:")
        val num = readLine()!!.toInt()
        valores.add(num)

        if (num < 72) {
            soma += num
        }

        concat += "${num} "
    }
    println("Os valores informados são: ${concat}")
    println("E a soma dos valores menores que 72 é: ${soma}")

    main()

}

fun ex08 () {
    //Escreva um programa que calcule a média de quatro números informados pelo usuário, mas somente se esses números forem maiores que 0 e menores que 10. No final, se a média for maior que cinco o usuário receberá uma mensagem "Você passou no teste". Em qualquer outra situação, ele receberá uma mensagem de "tente novamente"
    var nota : Double
    var soma : Double = 0.0
    var notaArray = mutableListOf<Double>()

    for(i in 1..4) {
        println("Digite a ${i}ª nota:")
        nota = readLine()!!.toDouble()

        while (true) {
            if (nota < 0 || nota > 10) {
                println("ERRO: nota inválida, digite novamente a ${i}ª nota:")
                nota = readLine()!!.toDouble()

            } else {
                soma += nota
                notaArray.add(nota)
                break
            }
        }

    }
    val media = soma / 4
    println("As notas são: ${notaArray}. \nE sua média é: ${media}")

    if (media > 5) {
        println("Parabéns, você passou no teste!")
    } else {
        println("Infelizmente você não passou no teste.")
    }

    main()

}

fun ex09 () {
    //Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).
    println("Informe o ano que você nasceu:")
    val ano = readLine()!!.toInt()

    if (ano >= 2009) {
        println("Você tem ${2025-2009} anos. Já pode votar")
    } else {
        println("Você tem ${2025-2009} anos. Ainda não pode votar")
    }

    main()

}

fun ex10 () {
    //Tendo como entrada a altura e o gênero designado ao nascer (codificado da seguinte forma: 1: feminino - 2: masculino - ) de uma pessoa, construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes fórmulas.
    println("Informe sua altura:")
    val altura = readLine()!!.toDouble()
    println("Informe seu gênere: \n1 - Feminino \n2 - Masculino")
    val option = readLine()!!.toInt()

    when (option) {
        1 -> { //feminino
            val peso = (62.1 * altura) - 44.7
            println("Seu peso ideal é ${peso}")
        }
        2 -> { //masculino
            val peso = (72.7 * altura) - 58
            println("Seu peso ideal é ${peso}")
        }
        else -> println("ERRO: opção inválida.")
    }

    main()

}

fun ex11 () {
    //Uma micro calculadora
    //Escreva um programa para ler 2 valores inteiros informados pelo usuário e uma das seguintes operações a serem executadas (codificada da seguinte forma: 1. Adição, 2. Subtração, 3. Divisão, 4. Multiplicação).
    //O programa deve calcular e escrever o resultado dessa operação sobre os dois valores lidos.
    //Observação: Considere que só serão lidos os valores 1, 2, 3 ou 4 para as operações.
    println("Digite um valor:")
    val num1 = readLine()!!.toDouble()
    println("Digite outro valor:")
    var num2 = readLine()!!.toDouble()
    println("Qual operação deseja executar? \n1 - Adição \n2 - Subtração \n3 - Divisão \n4 - Multiplicação \n5- Voltar para o menu")
    val option = readLine()!!.toInt()

    when (option) {
        1 -> {
            val soma = num1 +num2
            println("A soma dos dois valores (${num1} e ${num2}) é ${soma}.")
        }
        2 -> {
            val subtracao = num1 - num2
            println("A subtração dos dois valores (${num1} e ${num2}) é ${subtracao}")
        }
        3 -> {
            while (true) {
                if (num2 == 0.0) {
                    println("ERRO: não é possível dividir por 0. Digite novamente:")
                    num2 = readLine()!!.toDouble()
                } else {
                    val divisao = num1 / num2
                    println("A divisão dos dois valores (${num1} e ${num2}) é ${divisao}")
                    break
                }
            }
        }
        4 -> {
            val multiplicacao = num1 * num2
            println("A multiplicação dos dois valores (${num1} e ${num2}) é ${multiplicacao}")
        }
        5 -> main()
        else -> println("ERRO: opção inválida.")
    }

    ex11()

}