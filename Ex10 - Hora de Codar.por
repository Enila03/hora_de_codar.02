programa
{
	
	funcao inicio()
	{
		inteiro cod
		real altura, peso

		escreva("Informe sua altura:\n")
		leia(altura)
		escreva("Informe seu gênero:\n1 - Feminino \n2 - Masculino\n")
		leia(cod)

		se(cod == 1){
			peso = (62.1 * altura) - 44.7
			escreva("Seu peso ideal é: "+peso)
		} senao se(cod == 2) {
			peso = (72.7 * altura) - 58
			escreva("Seu peso ideal é: "+peso)
		} senao {
			escreva("ERRO: código inválido")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 185; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */