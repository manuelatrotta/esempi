package esempi;

import java.util.Scanner;

public class MediaMultipliTre {
	
	public static void main(String[] args) {
		
		System.out.println("inserire un numero:");
		Scanner input = new Scanner(System.in);
		 int numeroIterazioni = input.nextInt();		 
		 int somma = 0;
		 for(int i=0; i<numeroIterazioni; i++) {
			 System.out.println("inserire un numero:");
			 Scanner input1 = new Scanner(System.in);
			 int numeroUtente = input.nextInt();
			 if(numeroUtente % 3 == 0) {
				 somma += numeroUtente;
				 System.out.println("somma" + somma);
			 }else {
				 System.out.println("numero non divisibile per 3");
			 }
		 }
		 int media = somma/numeroIterazioni;
		 System.out.println("media" + media);
	}
}
