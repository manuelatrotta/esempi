package esempi;

public class Sottomatrice {
	
	public static void main(String []args) {
		
		int[][] matrice = { { 1, 2, 3 }, { 4, 8, 3 }, { 10, 7, 3 } };
		
		for(int i=1; i<matrice.length - 1; i++) {
			int sum = 0;
			for (int j=1; j<matrice.length - 1; j++) {
				for(int k=i; k< i+2; k++) {
					for(int r=i; r<i+2; r++) {
						sum += matrice[k][r];
					}
				}
			}
				System.out.println(sum);
		}
	}

}
