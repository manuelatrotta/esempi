package esempi;

public class TestPunto {
	
	public static void main (String [] args) {
		
		Punto puntoA = new Punto(22,22);
		
		Punto puntoB = new Punto(22,22);
		
		double dist  = Punto.calcolaDistanza(puntoA.getM_x(), puntoA.getM_y(), puntoB.getM_x(), puntoB.getM_y());
		
		System.out.println(dist);
	}
}