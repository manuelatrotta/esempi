package esempi;

import java.util.Scanner;

public class Matrice {
	
	public static void main(String[] args) {
		
		int x [] [] = new int [3] [3];
		
		for(int i=1; i<3; i++) {
			for(int j = 1; j<3; j++) {
				System.out.println("inserisci dei valori");
				Scanner input = new Scanner(System.in);
				 x[i] [j]= input.nextInt(); 
				 System.out.println(x[i][j]);
			}
		}
	}
}