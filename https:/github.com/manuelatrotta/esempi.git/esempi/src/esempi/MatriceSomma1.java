package esempi;

public class MatriceSomma1 {

	public static void main (String [] args) {
		
		int somma =0;
		int [][] a = { { 1, 2, 3 }, { 4, 8, 3 }, { 10, 7, 3 } };
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
					somma += a[i][j];
			}
		}
		System.out.println(somma);
	}
}
