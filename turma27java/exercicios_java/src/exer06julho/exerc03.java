package exer06julho;

public class exerc03 {

	public static void main(String[] args) {
		int N1[][] = new int [4][6];
		int N2[][] = new int [4][6];
		int M1[][] = new int [4][6];
		int M2[][] = new int [4][6];
		
		for(int c = 0; c < 4; c++) {
			for(int l = 0; l < 6; l++) {
				N1[c][l]=(int) (Math.random()*10);
				N2[c][l]=(int) (Math.random()*10);
			}
		}
		
		//matriz 3
		for(int c = 0; c < 4; c++) {
			for(int l = 0; l < 6; l++) {
				M1[c][l]=N1[c][l]+N2[c][l];
				System.out.print(M1[c][l] + "\t");
			}
			System.out.println();
		}
		
		//matriz 4
		for(int c = 0; c < 4; c++) {
			for(int l = 0; l < 6; l++) {
				M2[c][l]=N1[c][l]-N2[c][l];
				System.out.print(M2[c][l] + "\t");
			}
			System.out.println();
		}

	}

}
