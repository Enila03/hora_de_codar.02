programa
{
	
	funcao inicio()
	{

		inteiro num1
		inteiro num2
		inteiro num3
		
		escreva("Digite um número: ")
		leia(num1)
		escreva("Digite outro número diferente: ")
		leia(num2)
		escreva("Digite outro número diferente: ")
		leia(num3)

		se(num1 == num2 ou num1 == num3 ou num2 == num3){
			escreva("ERRO: há valores iguais")
		} senao{

			se(num1 < num2 e num1 < num3){ //menor número 1
				escreva("A soma dos dois maiores valores é: "+(num2+num3)+".")
			} senao se(num2 < num1 e num2 < num3){ //menor número 2
				escreva("A soma dos dois maiores valores é: "+(num1+num3)+".")
			} senao { // menor número 3
				escreva("A soma dos dois maiores valores é: "+(num2+num1)+".")
			}
			
		}	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 681; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */