package esempi;

import java.util.Scanner;

public class MediaInput {
	
	
	public static void main (String[] args) {
		

		int conteggio=0;
		int sum = 0;
		int a=1;
		
		
		while(a !=0) {
			System.out.println("inserire un numero:");
			Scanner input = new Scanner(System.in);
			 a = input.nextInt();
			 System.out.println(a);
			 sum += a;
			 if(a == 0) {
					conteggio = conteggio;
				}else {
			 conteggio = conteggio +1;
			 System.out.println("conteggio"+ " "+ conteggio);
			  int media = sum /conteggio;
			 System.out.println("somma" +" "+ sum);
			 
			 System.out.println("media" + " "+ media);	
			}
		}
	}
}


