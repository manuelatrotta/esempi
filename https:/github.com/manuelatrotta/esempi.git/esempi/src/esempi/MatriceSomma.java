package esempi;

public class MatriceSomma {
	
	public static void main (String[] args) {
		
//		int  x [] [] = new int [2] [3];
//		int k=2;
//		
//		for(int i=1; i<=2; i++) {
//			for(int j=1; j<=3; j++) {
//				x[i] [j] = x[i] [j] + k;
//				
//			}
//		}
		int[][] a = { { 1, 2, 3, 4, 5 }, { 4, 8, 3, 2, 7 }, { 10, 7, 3, 6, 8 }, { 9, 2, 8, 3, 1 } };

		int somma = 0;
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++) {
				somma += a[i][j];
			}
		System.out.println(somma);

		for (int j = 0; j < 4; j++)
			for (int i = 0; i < a.length; i++) {
				somma += a[i][j];
			}
		System.out.println(somma);
	}
}
