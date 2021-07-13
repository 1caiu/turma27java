package Lista1JAVA;

import java.util.Scanner;

public class Exercicio4 {
	/*4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:  */
	
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			double a, b, c, r, s, d;
			
			System.out.println("Insira um valor A: ");
			a = leia.nextDouble();
			
			System.out.println("Insira um valor B: ");
			b = leia.nextDouble();
			
			System.out.println("Insira um valor C: ");
			c = leia.nextDouble();
			
			r = Math.pow((a+b), 2);
			s = Math.pow((b+c), 2);
			
			d = ((r+s)/2);
			
			System.out.println("O resultado é:  " + d);
	}

}
