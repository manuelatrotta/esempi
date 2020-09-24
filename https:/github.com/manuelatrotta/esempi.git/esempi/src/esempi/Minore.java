package esempi;

import java.util.Scanner;

public class Minore {
	
	public static void main (String [] args) {
		
		Scanner  input = new  Scanner(System.in);
		int num = input.nextInt ();
		
		boolean  condizione = false;
		
		while(num !=0) {
			
			int  minore = num;
			num = input.nextInt ();
			
			if(num < minore) {
				minore = num;
			}
			System.out.println("numero minore tra quelli inseriti è:"+ minore);
		}
	}

}
