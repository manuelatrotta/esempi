package esempi;

import java.util.Scanner;

public class ContaFino {
	
	public static void main (String[] args) {

		 int sum = 0;
		 boolean condizione = true;
		 while(condizione) {
			 System.out.println("inserisci dei valori");
			 Scanner input = new Scanner(System.in);
			 int numero = input.nextInt();
			 if((numero % 2 == 0 && numero < 0) || (numero % 3 == 0 && numero >0)) {
				 sum += numero;
				 condizione = true;
				 System.out.println("numeri corretti:" + " "+numero);
			 }else {
				 System.out.println("inserire valori validi");
				 condizione = false;
			 }
			 System.out.println("somma totale:" + " "+ sum);
		 }
	}	 
}
