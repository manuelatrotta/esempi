package esempi;

import java.util.Scanner;

public class Esercizio1 {
	
	//dato x verificare se è divisibile per 2 e per 5 e in tal caso effettuare la moltiplicazione
	
	public static void main (String[] args) {
		
		System.out.println("inserire un numero:");
		Scanner input = new Scanner(System.in);
		 int x = input.nextInt();

		 if(x % 2 == 0 && x % 5 == 0) {
			 
			 System.out.println("è divisibile per due e per cinque");
			int moltiplicazione = x * 100;
			System.out.println(moltiplicazione);
		 }else {
		 	System.out.println("non è divisibile per due e per cinque");
		 }
	}
}
