package esempi;

public class MatriceQuadrata {
	
	public static void main ( String [] args) {
		
		
		
		int[][] matrice = { { 1, 2, 3 }, { 4, 8, 3 }, { 10, 7, 3 } };
		
		int sumA = 0; 
		int sumB = 0;
		int max = sumA;
		//stampa elementi presenti nella matrice 
		for(int i= 0; i<matrice.length; i++) {
			for(int j=0; j<matrice.length; j++) {
				System.out.println(matrice[i][j]);
			}
		}
		
		for(int i=0; i<matrice.length;i++) {
			sumA += matrice[i][i];
		}
		
		for(int i=0; i<matrice.length;i++) {
			sumB += matrice [(matrice.length-1)- i][i];
		}
		if(max < sumB) {
			max = sumB;
		}
		
		System.out.println("somma diagolale a:" +sumA);
		System.out.println("somma diagolale b:" +sumB);
		System.out.println("somma diagonale maggiore:" +max);
	}
}
