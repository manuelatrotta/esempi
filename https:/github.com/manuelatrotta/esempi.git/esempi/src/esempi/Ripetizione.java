package esempi;

import java.util.Scanner;

public class Ripetizione {
	
	public static void main(String[] args) {
		for(int i= 1; i<=5; i++) {
			
			System.out.println("inserire un numero:");
			 Scanner input = new Scanner(System.in);
			 int numeroIterazioni = input.nextInt();
			
			for(int j= 1; j<=numeroIterazioni; j++) {
				Scanner input1 = new Scanner(System.in);
				 String parola = input1.next();
					System.out.println(parola);
			}
		}
	}
}
