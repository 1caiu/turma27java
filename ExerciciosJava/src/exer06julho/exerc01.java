package exer06julho;

public class exerc01 {

	public static void main(String[] args) {
		
		int notas [] = new int [5];
		int maior = 0;
		
		for (int i = 0; i < notas.length; i++) {
			notas[i]=(int) Math.round(Math.random()*14);
			System.out.println(notas[i]);
				if (notas[i] > maior) {
					maior = notas[i];
				}
		}
		
		System.out.println("Maior valor: "+maior);
		

	}

}
