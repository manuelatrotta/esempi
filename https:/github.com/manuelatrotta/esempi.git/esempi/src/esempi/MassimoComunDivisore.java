package esempi;

public class MassimoComunDivisore {
	
	public static void main (String [] args) {
		
		int a = 25;
		int div = 5;
		isDivisore(a, div);
	}
	

		
		
		private static void isDivisore(int num, int div) {
			boolean condizione;
			for(int i=1; i<= num; i++) {
				if(div * i == num) {
					condizione =  true;
					System.out.println("ok");
				}else {
					condizione = false;
				}
			}

		}
		//-------------------
		
//		private static int MCD(int a, int b) {
//			int MCD=0;
//			int div = 0;
//			if(a>b) {
//				int max = a;
//			
//				for(int i=1;i<max;i++) {
//					if(isDivisore(a,div) == isDivisore(b,div)) {
//						 MCD = i;
//					}
//				}
//			}
//		}


}
