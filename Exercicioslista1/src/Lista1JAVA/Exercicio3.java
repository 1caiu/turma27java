package Lista1JAVA;

import java.util.Scanner;

public class Exercicio3 {

	
	/* 3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos e 
	mostre-o expresso em horas, minutos e segundos.*/
	
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, horas, minutos, segundos;
		System.out.println("Digite um n�mero: ");
			numero=leia.nextInt();
			
			horas = (numero/60);
			minutos=(numero%60);
			segundos=(numero % 60) % 60;


		System.out.println("O total �: " +horas+ " horas " +minutos+ " mins " + segundos+ " segundos. ");	

		

	}

}
