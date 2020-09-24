package esempi;

public class Palindroma {
	
	public static void main (String [] args) {
		
		String parola = "radar";

		//String rovescio = "ciao";

		int lunghezza = parola.length();

//		for (int i = parola.length() - 1; i >= 0; i--) {
//			rovescio += parola.charAt(i);
//		}
//		System.out.println(rovescio);
//
//		if (lunghezza == 1) {
//			System.out.println("è palindroma");
//		}
//		if (rovescio.equals(parola)) {
//			System.out.println("è palindroma");
//		} else {
//			System.out.println("non è palindroma");
//		}
		boolean risultato = false;
		
		for (int i = 0; i <=lunghezza - 1; i++) {
			if (parola.charAt(i) == parola.charAt(--lunghezza)) {
				risultato=true;
			}else {
				risultato = false;
			}
		}
		if(risultato == true) {
			System.out.println("è palindroma");
		}else {
			System.out.println("non è palindroma");
		}
		 //System.out.println(rovescio);
	}
}
