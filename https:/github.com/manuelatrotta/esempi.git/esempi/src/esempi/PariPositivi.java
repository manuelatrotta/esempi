package esempi;

import java.util.Scanner;

public class PariPositivi {
	//versione in cui chiedo in input il numero di elementi da inserire 
	public static void main (String[] args) {
//		System.out.println("inserire il numero di elementi");
//		Scanner input = new Scanner(System.in);
//		int numeroElementi= input.nextInt();
//
//		int numeroUtente = 0;
//		
//		for(int i=1; i<=numeroElementi; i++) {
//			System.out.println("inserire dei numeri per verificare se sono tutti pari e positivi");
//			Scanner input1 = new Scanner(System.in);
//			numeroUtente = input.nextInt();
//			}
//		if(numeroUtente >0 && numeroUtente % 2 ==0) {
//			System.out.println("sono numeri pari e positivi");
//		}else {
//			System.out.println("no");
//		}
		

		int numeroUtente = 1;
		
		while(numeroUtente != 0)	{
			System.out.println("inserire dei numeri per verificare se sono tutti pari e positivi, se si vuole uscire scrivere uscita");
			Scanner input = new Scanner(System.in);
			numeroUtente = input.nextInt();
			if(numeroUtente >0 && numeroUtente % 2 ==0) {
				System.out.println("sono numeri pari e positivi");
			}else if(numeroUtente == 0){
				System.out.println("fine programma");
			}else {
				System.out.println("no");
			}
		}
	}
}
