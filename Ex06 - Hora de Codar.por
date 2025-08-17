programa
{
	
	funcao inicio()
	{
		inteiro num1
		inteiro num2
		inteiro num3
		inteiro num4
		inteiro maior
		
		escreva("Digite um número: ")
		leia(num1)
		escreva("Digite outro número diferente: ")
		leia(num2)
		escreva("Digite outro número diferente: ")
		leia(num3)
		escreva("Digite outro número diferente: ")
		leia(num4)

		se(num1 == num2 ou num1 == num3 ou num1 == num4 ou num2 == num3 ou num2 == num4 ou num3 == num4){
			escreva("ERRO: há valores iguais")
		} senao{

			se(num1 > num2 e num1 > num3 e num1 > num4){
				maior = num1
			} senao se(num2 > num1 e num2 > num3 e num2 > num4){
				maior = num2
			} senao se(num3 > num1 e num3 > num2 e num3 > num4) {
				maior = num3
			} senao {
				maior = num4
			}

			escreva("O primeiro valor é: "+num1+".\n")
			escreva("O último valor é: "+num4+".\n")
			escreva("O maior valor é: "+maior+".\n")
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 864; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */