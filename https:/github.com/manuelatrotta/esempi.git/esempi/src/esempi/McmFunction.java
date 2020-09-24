package esempi;

public class McmFunction {

	public static void main(String[] args) {

		int a = 21;
		int b = 6;
		MCM(a, b);

	}

//funzione calcolo massimo comun multiplo
	private static void MCM(int a, int b) {
		int mcm = a * b / MCD(a, b);
		System.out.println(mcm);
	}

//funzione calcolo massimo comun divisore
	private static int MCD(int a, int b) {
		int MCD = 0;
		int div = 0;
		if (a > b) {
			int max = a;

			for (int i = 1; i < max; i++) {
				if (isDivisore(a, div) && isDivisore(b, div)) {
					MCD = i;
				}
			}
		}
		return MCD;
	}

//funzione calcolo se un numero è divisore dell'altro 
	private static boolean isDivisore(int num, int div) {

		for (int i = 1; i <= num; i++) {
			if (div * i == num) {
				return true;
			}
		}
		return false;
	}

}
