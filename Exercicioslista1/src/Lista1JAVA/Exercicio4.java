package Lista1JAVA;

import java.util.Scanner;

public class Exercicio4 {
	/*4. Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o:  */
	
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
			
			System.out.println("O resultado �:  " + d);
	}

}
