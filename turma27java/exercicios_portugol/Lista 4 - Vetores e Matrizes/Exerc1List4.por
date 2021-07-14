programa
{
	/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma 
	 * atividade e o escreva em seguida.. 
	Encontre após a maior pontuação e a apresente. 

	I. Criar um vetor com 5 espaços. 
	II. Preencher o vetor com números que o usuário quiser
	III. Exibir vetor (todos os números)
	IV. Encontre o maior número do vetor.
	
	 */
	funcao inicio()
	{
		inteiro pontuacao[5], maiorPontuacao=0

	     para (inteiro i =0; i < 5; i++){
	     	escreva("Digite um número: ")
	     	leia(pontuacao[i])
	     	se (pontuacao[i]>maiorPontuacao){
	     		maiorPontuacao=pontuacao[i]
	     	}
	     }
	     limpa()
	     para (inteiro i = 0; i < 5; i++){
	     	escreva(pontuacao[i]+"\n")
	     }

		escreva("A maior pontuação foi "+maiorPontuacao)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 137; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {pontuacao, 15, 10, 9}-{maiorPontuacao, 15, 24, 14}-{i, 17, 20, 1}-{i, 25, 20, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */