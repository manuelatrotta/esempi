package esempi;

public class Fattoriale {

	public static void main(String[] args) {

		int num = 5;
		int fat = 1;

		// bisogna moltiplicare num fino a num stesso
		for (int i = 1; i <= num; i++) {
			fat = fat * i;
			System.out.println(fat);
		}
	}
}
