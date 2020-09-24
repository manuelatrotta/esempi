package esempi;

public class Mcm {

	public static void main(String[] args) {
		int min=0;
		int a = 6;
		int b = 2;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				int ma = a * i;
				int mb = b * j;
				if (ma == mb) {
					//System.out.println(ma);
					if(min==0) {
						min = ma;
					}else if(ma< min) {
						min =ma;
					}
				}
			}	
		}
		System.out.println(min);
	}
}
