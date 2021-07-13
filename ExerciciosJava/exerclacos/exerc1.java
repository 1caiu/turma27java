package exerclacos;

import java.util.*;
public class exerc1 {
  //Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
	dias e mostre-a expressa apenas em dias.
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int a, b, c, maior = 0;
		
		System.out.println("Insira um valor para A: ");
		a = leia.nextInt();
		
		System.out.println("Insira um valor para B:");
		b = leia.nextInt();
		
		System.out.println("Insira um valor para C: ");
		c = leia.nextInt();
		
		if (a>b && a>c) {
			maior = a;
		} else if (b>a && b>c) {
			maior = b;	
		} else if (c>a && c>b) {
			maior = c;
		} else {
			System.out.println("Não há número maior.");
		}
		
		System.out.println("O maior número é "+maior);
		
		
		
	}

}

	}

}
