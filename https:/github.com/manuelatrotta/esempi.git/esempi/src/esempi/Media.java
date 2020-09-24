package esempi;

import java.util.Scanner;

public class Media {
	
	public static void main(String[]args) {
		
		int conteggio=0;
		int sum = 0;
		boolean condizione = true;
		
		while(condizione) {
			System.out.println("inserire un numero:");
			Scanner input = new Scanner(System.in);
			 int a = input.nextInt();
			 System.out.println(a);
			 if(a == 0) {
					condizione = false;	
				}else {
			 sum += a;
			 conteggio++;
			 System.out.println("conteggio"+ " "+ conteggio);
			  int media = sum /conteggio;
			 System.out.println("somma" +" "+ sum);
			 System.out.println("media" + " "+ media);	
			}
		}
	}
}
