package exer06julho;

public class exerc02 {

	public static void main(String[] args) {
		int soma=0, maiorX=0, maior=0; 
		int dado[] = new int [10];
		
		for(int i = 0; i < dado.length; i++) {
			dado[i]=(int) (Math.random()*10);
			System.out.println(dado[i]);
			
			soma+=dado[i];
			
			if (dado[i] > maior) {
				maior = dado[i];
			}
		}
		
		
		for(int i = 0; i < dado.length; i++) {
			if (dado[i] == maior) {
				maiorX++;
			}

	}
	}
}