package costruzione;

public class Robot extends Macchina {
	
	private int numeroBraccio;
	

	
	
	

	public Robot(String nome, String prefisso, String seriale, String destinazione, int costoMateriale,
			int costoSviluppo, int numeroBraccio) {
		super(nome, prefisso, seriale, destinazione, costoMateriale, costoSviluppo);
		this.numeroBraccio = numeroBraccio;
	}

	public Robot(int id, String nome, String prefisso, String seriale, String destinazione, int costoMateriale,
			int costoSviluppo) {
		super(nome, prefisso, seriale, destinazione, costoMateriale, costoSviluppo);
		// TODO Auto-generated constructor stub
	}

	public int getNumeroBraccio() {
		return numeroBraccio;
	}

	public void setNumeroBraccio(int numeroBraccio) {
		this.numeroBraccio = numeroBraccio;
	}
	
	@Override
	public String generaSeriale() {
		setPrefisso("ROB");
		String seriale = getPrefisso() + incrementaId();
		return seriale;
	}

	@Override
	public String toString() {
		return "Robot [numeroBraccio=" + numeroBraccio + "]";
	}
}
