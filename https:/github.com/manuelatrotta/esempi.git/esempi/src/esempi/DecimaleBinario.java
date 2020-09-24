package esempi;

public class DecimaleBinario {
	
	public static void main (String[] args) {
		
		int n = 25;
		toBinary(n);
		
		
	}
	
	
	private static void toBinary(int n) {
		
		String result = new String();
		while (n > 0) {
			int resto = n % 2;
			int divisore = n / 2;
			result = resto + result;
			n = divisore;
		}
		System.out.println(result);
		
		

//		while (n > 0) {
//			int resto = n % 2;
//			int divisore = n / 2;
//			n = divisore;
//			String result = new String();
//			result += resto;
//			for (int i = result.length() - 1; i >= 0; i--) {
//				result += i;
//				System.out.println(result);
//			}
//		}
	}
}
