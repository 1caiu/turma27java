package Lista1JAVA;

import java.util.Scanner;

public class Exercicio2 {

	/*2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. */
	
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int numero, mes, anos, dia;
		System.out.println("Insira um n�mero e veja o que acontece: ");
				numero=leia.nextInt();
			
			anos=(anos=365);
			mes=(numero % 365) / 30;
			dia= (numero % 365) %30;
			
			System.out.println("\n Esse n�mero representa " + anos + " anos, " + numero + " meses, e " + dia + " dias.");
					
		
	}
}
