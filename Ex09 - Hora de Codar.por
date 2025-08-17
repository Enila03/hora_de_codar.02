programa
{
	
	funcao inicio()
	{
		inteiro ano

		escreva("O ano que você nasceu:\n")
		leia(ano)

		se(ano < 2009){
			escreva("Você tem "+(2025-ano)+" anos. Já pode votar!")
		} senao {
			escreva("Você tem "+(2025-ano)+" anos. Ainda não pode votar.")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 221; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */