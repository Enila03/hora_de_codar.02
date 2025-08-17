programa
{
	
	funcao inicio()
	{
		inteiro num1, num2, cod, resultado

		escreva("Informe o 1º valor: ")
		leia(num1)
		escreva("Informe o 2º valor: ")
		leia(num2)
		escreva("Qual operação deseja executar?\n1 - Adição \n2 - Subtração \n3 - Divisão \n4 - Multiplicação\n")
		leia(cod)

		escolha(cod){
			caso 1:
				resultado = num1 + num2
				escreva("A adição dos valores "+num1+" e "+num2+" é: "+resultado)
				pare

			caso 2:
				resultado = num1 - num2
				escreva("A subtração dos valores "+num1+" e "+num2+" é: "+resultado)
				pare
			caso 3:
				resultado = num1 / num2
				escreva("A divisão dos valores "+num1+" e "+num2+" é: "+resultado)
				pare
			caso 4: 
				resultado = num1 * num2
				escreva("A multiplicação dos valores "+num1+" e "+num2+" é: "+resultado)
				pare
			caso contrario:
				escreva("ERRO: Valor inválido.")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 760; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */