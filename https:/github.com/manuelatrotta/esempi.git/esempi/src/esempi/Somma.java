package esempi;

import java.util.Scanner;

public class Somma {

	public static void main(String[] args) {

		System.out.println("inserire un numero:");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();

		System.out.println("inserire un secondo numero:");
		Scanner input1 = new Scanner(System.in);
		int b = input1.nextInt();

		System.out.println("hai inserito i numeri:" + " " + a + " " + b);

//		if (a < b) {
//			int somma = 0;
//			for (int i = a; i <= b; i++) {
//				if (i % 2 == 0) {
//					System.out.println("numeri pari:" + i);
//					somma += i;
//				}
//				System.out.println(somma);
//			}
//		} else {
//			System.out.println("attenzione a deve essere minore di b");
//			Scanner input2 = new Scanner(System.in);
//			 a = input2.nextInt();
//			 b = input2.nextInt();
		boolean supporto = true; //input scorretto
		while(supporto) {
			if(a<b) {
			int somma = 0;
			supporto = false;
				for (int i = a; i <= b; i++) {
					if (i % 2 == 0) {
						System.out.println("numeri pari:" + i);
						somma += i;
					}
					System.out.println(somma);
				}
				}else {
					System.out.println("inserire un numero:");
					Scanner input2 = new Scanner(System.in);
					 a = input2.nextInt();

					System.out.println("inserire un secondo numero:");
					Scanner input3 = new Scanner(System.in);
					 b = input3.nextInt();
					System.out.println("attenzione a deve essere minore di b");
			}
		}
	}	
}

