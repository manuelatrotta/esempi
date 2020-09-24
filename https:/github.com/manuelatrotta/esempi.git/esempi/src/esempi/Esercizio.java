package esempi;

public class Esercizio {
	
	public static void main (String [] args) {
		
		int numeroFinale = -1;
		int N = 0;
		int quadrato = 0;
		if (numeroFinale < 0) {
		    System.out.println("Errore: il numero deve essere positivo");
		}else {
		    N = 1;   
		while (N <= numeroFinale ){
		        quadrato = N*N ;
		        System.out.println("\nNumero: " + N + ",Quadrato:" + quadrato) ;
		        N = N + 1 ;
		    }
		}
	}

}
