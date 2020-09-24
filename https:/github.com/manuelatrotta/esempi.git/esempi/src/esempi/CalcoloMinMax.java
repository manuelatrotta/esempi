package esempi;

import java.util.Scanner;

public class CalcoloMinMax {
	
	public static void main (String []args) {

//		 System.out.println("inserisci numero dei valori da inserire");
//		 Scanner input = new Scanner(System.in);
//		 int numero = input.nextInt();
//		 System.out.println(numero);
//
//		int num= 1;
//		int numeriInseriti = 0;
//		while (num !=0) {
//			 System.out.println("inserisci numero dei valori da inserire");
//			 Scanner input1 = new Scanner(System.in);
//			num = input1.nextInt();
//			 System.out.println(num);
//			numeriInseriti ++;
//			int max = num;
//			int  minore = num;
//			num = input.nextInt ();
//			if(num < minore) {
//				minore = num;
//			}else if(num > minore) {
//				max = num;
//			}
//			System.out.println("numero minore tra quelli inseriti è:"+ minore);
//			System.out.println("numero maggiore tra quelli inseriti è:"+ max);
//		}
//		System.out.println("il totale dei numeri inseriti è:" + numeriInseriti);

		System.out.println("inserisci numero dei valori da inserire");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println(num);

		for (int i = 0; i <=num; i++) {
			System.out.println("inserisci i numeri");
			Scanner input1 = new Scanner(System.in);
			num = input1.nextInt();
			int max = num;
			int minore = num;
			System.out.println(num);
			int numero = input.nextInt();
			System.out.println(numero);
			if (numero < minore) {
				minore = numero;
			} else {
				max = numero;
			}
			System.out.println("numero minore tra quelli inseriti è:" + minore);
			System.out.println("numero maggiore tra quelli inseriti è:" + max);
		}
	

//	System.out.println("inserisci i numeri");
//	Scanner input1 = new Scanner(System.in);
//	int numIniziale = input1.nextInt();
//	
//	System.out.println("inserisci i numeri");
//	Scanner input = new Scanner(System.in);
//	int numFinale = input1.nextInt();
//	
//		for(int i=numIniziale; i<numFinale; i++) {
//			System.out.println(i);
//		}
	}
}		
