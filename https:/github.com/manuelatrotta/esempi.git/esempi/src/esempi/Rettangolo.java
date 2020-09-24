package esempi;

public class Rettangolo {
	
	private int lato;
	private int base;
	private int h;


	public Rettangolo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public int getLato() {
		return lato;
	}



	public void setLato(int lato) {
		this.lato = lato;
	}



	public Rettangolo(int i, int j, int k, int l) {
		this.setLato(lato);
	}



	public int perimetro(int lato1, int lato2, int lato3, int lato4) {
		int perimetro = lato1+lato2+lato3+lato4;
		return perimetro;
		
	}


	public int area(int base ,int h) {
		int area = base * h;
		return area;
		
	}
	
}




	
	



	

