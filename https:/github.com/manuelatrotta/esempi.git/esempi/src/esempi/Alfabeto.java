package esempi;

import java.util.Scanner;

public class Alfabeto {
	
	public static void main (String []args) {
		
		System.out.println("inserire un numero:");
		Scanner input = new Scanner(System.in);
		 int scelta = input.nextInt();
		
		if(scelta == 1) {
			System.out.println("A");
		}
		if(scelta == 2) {
			System.out.println("B");
		}
		if(scelta == 3) {
			System.out.println("C");
		}
		if(scelta == 4) {
			System.out.println("D");
		}
		if(scelta == 5) {
			System.out.println("E");
		}
		if(scelta == 6) {
			System.out.println("F");
		}
		
	}

}
