programa
{
	//EXERCÍCIO PARA.
	/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. 
	 * A prefeitura deseja saber:   
		a) média do salário da população; 
		b) média do número de filhos; 
		c) maior salário; 
		d) percentual de pessoas com salário até R$100,00.  7

		- perguntar para 20 pessoas salários e número de filhos. Depois que perguntar 
		- Responda as perguntas que o servidor pede:
		a) Somar todos os salários e dividir por numero de habitantes.
		b) Somar numero de filhos e dividir por n de hab.
		c) Comparar salários todas as vezes com o último maior.
		d) Percentual de pessoas c salário até R$100. %*
		-
*/
	funcao inicio()
	{
		real habitantes=4, filhos, somaFilhos=0, menos100=0
		real mediaFilhos, media, salario=0, somaSalario=0, maiorSalario=0, porcentagem=0
		para (inteiro c=1; c<=habitantes; c++){
			escreva("\nDigite seu salário: ")
			leia(salario)
			escreva("\nDigite número de filhos ")
			leia(filhos)
			somaSalario+=salario
			//somaSalario=somaSalario+salario método.
			somaFilhos+=filhos
			se(salario>maiorSalario) {
				maiorSalario=salario					
			}
			se (salario<100.00){
				menos100=menos100+1
				porcentagem=(menos100*100)/habitantes
			}
			
			
		}

		limpa()
		media= (somaSalario/habitantes)
		escreva("\nA media salarial é \n"+media)
		mediaFilhos =(somaFilhos/habitantes)
		escreva("\nO número de filhos por habitantes é " +mediaFilhos)
		escreva("\nMaior salário foi "+maiorSalario)
		escreva("\n O percentual de pessoas que com salário até R$100 são "+porcentagem+ "%")
		
		
			
	}
			
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1088; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */