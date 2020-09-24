package esempi;

public class Dispari {
	
	public static void main(String [] args) {
		
		int a = 5;
		int sum = 0;
		
		for(int i=0; i<=a; i++) {
			if( i % 2 !=0) {
				System.out.println("numeri dispari:" + i);
				int quadrato = i * i;
				System.out.println(quadrato);
				sum += i;
				System.out.println(sum);
			}
	
		}
		
	}

}
