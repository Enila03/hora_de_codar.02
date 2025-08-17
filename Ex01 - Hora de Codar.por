programa
{
	
	funcao inicio()
	{

		inteiro n1, n2

		escreva("Informe um número inteiro: ")
		leia(n1)
		escreva("Informe outro número inteiro: ")
		leia(n2)

		se(n1 > n2){
			escreva("O número " +n1+ " é maior que o " +n2+ ".")
		} senao se(n2 > n1){
			escreva("O número " +n2+ " é maior que o " + n1+ ".")
		} senao{
			escreva("Os números são iguais")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 231; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */