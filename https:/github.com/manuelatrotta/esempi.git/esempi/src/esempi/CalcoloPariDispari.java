package esempi;

import java.util.Scanner;

public class CalcoloPariDispari {
	
	public static void main (String[] args) {
		
		int a = 1;
		int conteggio = 0;
		int sommaPari = 0;
		int sommaDispari = 0;


		
		while(a != 0) {
			
			System.out.println("inserire un numero:");
			Scanner input = new Scanner(System.in);
			 a = input.nextInt();
			 if (a == 0) {
				 conteggio = conteggio;
			 }
			 
			 if(a % 2 == 0) {
				 sommaPari += a;
				 System.out.println("somma pari" + " "+ sommaPari);
			 }else {
				  sommaDispari += a;
				  System.out.println(" somma dispari" + " " +sommaDispari);
			 }
		}
		 int media = (sommaPari + sommaDispari) /conteggio;
		System.out.println("media" + " " + media);
	}
}
