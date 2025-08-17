programa
{
	
	funcao inicio()
	{

		inteiro valores[6], i, soma = 0, cont = 0
		cadeia concat = ""

		para(i = 0; i < 6; i++){
			escreva("Informe o "+(i+1)+"º valor: ")
			leia(valores[i])

			se(valores[i] < 72){
				soma += valores[i]

				se(cont == 0){
					concat = concat + valores[i]
				} senao {
					concat = concat + " + " + valores[i]
				}
				
			}
			cont++
		}

		escreva("A soma de todos os valores inferiores a 72 é: "+concat+" = "+soma)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 436; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */