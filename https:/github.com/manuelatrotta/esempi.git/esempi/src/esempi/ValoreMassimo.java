package esempi;

public class ValoreMassimo {
	
	public static void main (String[]args) {
		
		int a = 5;
		int b = 7; 
		int c = 9;
		
			
			if(a>b && a>c) {
				System.out.println(a);
			}
			if(b>a && b>c) {
				System.out.println(b);
			}
			if(c>b && c>a) {
				System.out.println(c);
			}		
	}
}
