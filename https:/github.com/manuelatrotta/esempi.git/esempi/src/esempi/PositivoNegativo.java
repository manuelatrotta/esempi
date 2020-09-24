package esempi;

import java.util.Scanner;

public class PositivoNegativo {
	
	public static void main (String[] args) {


			Scanner  input = new  Scanner(System.in);
			int num = input.nextInt ();
			
			boolean  condizione = false;
			
			while (num !=0) {
				
				int  precedente = num;
				num = input.nextInt ();
				
				if (precedente >0 && num <0) {
					condizione = true;
					System.out.println("numeri sequenza positivo/negativo");
				}else {
					System.out.println("sequenza non trovata");
				}
			}
	}		

}
