package esempi;

public class CalcoloMassimo {
	
		public static void main (String[] args) {
		
		int [] array = {77,76,75,74,73};
		
		int maggiore = array[0];
		
		
		for(int i=0; i<array.length; i++) {
			if(array[i] > maggiore) {
				maggiore = array[i];
			}
		}
		System.out.println(maggiore);
	}
}
