package Lista1JAVA;

import java.util.Scanner;

public class Exercicio1 {

	/*1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. */
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int anos, mes, dia, resultado;
		System.out.println("Ol�, vamos descobrir quanto tempo voc� tem na Terra? \n Digite o ano em que voc� nasceu: ");
				anos=leia.nextInt();
		System.out.println("Agora, digite o m�s: ");
			mes=leia.nextInt();
		System.out.println("Muito bem! Digite o dia do seu anivers�rio: ");
			dia=leia.nextInt();
			
			anos=anos*365;
			mes=mes*30;
			dia=dia+anos+mes;
			
			System.out.println("Voc� est� h� "+dia+ " na Terra!");
					
		
	}
}
