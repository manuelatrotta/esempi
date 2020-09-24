package esempi;

public class Divisore {
	
	public static  void main (String[] args) {
		int n = 21;
		 divisore1(n);
	}
//		int n= 12;
//		int div = 1;
//		 for(int i = 0; i<=n; i++) {
//			 if(n==0) {
//				 System.out.println("il divisore di zero è 0"); 
//			 }
//			 if(div * i == n) {
//					System.out.println(div);
//					System.out.println(i);
//					System.out.println(n);
//			 }
//		 div++;
//		 }
//	 }
//		int n = 12;
//		for(int i = 0; i<=n; i++) {
//			int j= 1;
//			while(j<n) {
//				if(i*j ==n) {
//					System.out.println(j);
//				}else if(i*j >n){
//					break;
//				}
//				j++;
//			}
//		}
	


	
	private static void divisore(int n) {
		for (int i = 0; i <= n; i++) {
			int j = 1;
			while (j < n) {
				if (i * j == n) {
					System.out.println(j);
				} else if (i * j > n) {
					break;
				}
				j++;
			}

	}
	}
		
	private static void divisore1(int n) {
		
//		int numeroDivisori = 0;
//		for(int i=1; i<=n; i++) {
//			if(n%i ==0) {
//				numeroDivisori++;
//				System.out.println(i);
//			}
//		}
//		if(numeroDivisori == 2) {
//			System.out.println("il numero è primo");
//		}
		

	}
}

