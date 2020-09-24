package esempi;

import java.util.Scanner;

public class StringUtente {
	
	public static void main(String [] args) {
		
		//chiedere inserimento una parola 
		

		System.out.println("inserire una parola:");
		Scanner input = new Scanner(System.in);
		String s = input.next();
		System.out.println("parola inserita" + " " + s);
		
		int lunghezza = s.length();
		System.out.println("la lunghezza della parola inserita" + " " + lunghezza);
		
		
			System.out.println("inserire un valore > 0 e minore della lunghezza della parola:");
			Scanner input1 = new Scanner(System.in);
			int a = input.nextInt();
			
			System.out.println("inserire un valore > 0 e minore della lunghezza della parola:");
			Scanner input2 = new Scanner(System.in);
			int b = input.nextInt();
			
			int inizio=0;
			int fine = 0;
			
			if((a >0 && a <= lunghezza-1) && (b >0 && b <= lunghezza)){
				if(a<b) {
					 inizio = a;
					 fine = b;
				}else {
					fine = a;
					 inizio = b;
				}
				String sottostringa = s.substring(inizio, fine);
				System.out.println(sottostringa);
			}else {
				System.out.println("inserire altri valori validi");
			}
		}
	}


