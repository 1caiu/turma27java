programa
{
	/* 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e 
	mostre-o expresso em horas, minutos e segundos.
	*/
	funcao inicio()
	{
		inteiro numero, horas, minutos, segundos
		escreva("Digite um numero: ")
		leia(numero)

		horas=(numero/60) 
		minutos=(numero%60)
		segundos=(numero % 60) %60

		escreva( "O total é: " +horas+ " horas " +minutos+ " mins " + segundos+ " segundos. " )	

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 441; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */