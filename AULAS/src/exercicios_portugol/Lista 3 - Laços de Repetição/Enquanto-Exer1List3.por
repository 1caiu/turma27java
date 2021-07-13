programa
{
	/* 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, 
	a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo 
	valores positivos. 
	Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.

	I. Leia um monte de número
	II. Some todos os numeros lidos
	III. Média de todos os numeros lidos (SOMAR TODOS E DIVIDIR PELO Nº DA QNTDADE INSERIDA)
	IV. Mostrar quantos numeros foram lidos

		CONDIÇÃO: só executa se o n inserido for maior que 0, ou seja, um numero positivo.
	
	*/
	
	funcao inicio()
	{
		inteiro numero, soma=0
		real total=0
		escreva("Digite um numero: ")
		leia(numero)
		
		enquanto (numero>0){
		 soma=soma+numero 
		 total++
		 escreva("Digite um numero: ")
		 leia(numero)
		 
		}
		limpa()
		escreva("Total de numeros: "+total)
		escreva("\nSoma dos numeros: "+soma)
		escreva("\nMédia dos numeros: "+(soma/total))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 878; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */