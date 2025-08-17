programa
{
	
	funcao inicio()
	{
		inteiro i
		real notas[4], cont = 0.0, media

		para(i = 0; i < 4; i++){
			escreva("Informe a "+(i+1)+"º nota:\n")
			leia(notas[i])

			se(notas[i] < 0 ou notas[i] > 10){
				escreva("ERRO: Nota inválida, tente novamente.\n")
				i--
			} senao {
				cont += notas[i]
			}
	
		}

		media = cont / 4
		
		se(media > 5){
			escreva("Parabéns! Sua média é "+media+". Você passou no teste!")
		} senao {
			escreva("Sua média é "+media+". Infelizmente você não passou no teste. Tente novamente.")
		}
	
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 468; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */