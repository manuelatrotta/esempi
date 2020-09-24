package esempi;

import java.util.Scanner;

public class EquazionePrimoGrado {
	
	public static void main (String[]args) {
	
	//ax+b=0  x=-b/a
	
		int a = 0;
		while(a==0) {
			
			System.out.println("inserire a:");
			Scanner input = new Scanner(System.in);
			a = input.nextInt();

			System.out.println("inserire b:");
			Scanner input1 = new Scanner(System.in);
			int b = input1.nextInt();
			
			int x = -b/a;
			
			System.out.println(x);
		}
	}
}
