package costruzione;

public class Impacchettatrice extends Macchina {
	
	private int prodotti;

	
	public int getProdotti() {
		return prodotti;
	}

	public void setProdotti(int prodotti) {
		this.prodotti = prodotti;
	}

	

	public Impacchettatrice(String nome, String prefisso, String destinazione, String tipologia, int costoMateriale, int costoSviluppo, int prodotti) {
		super(nome, prefisso, destinazione, tipologia, costoMateriale,costoSviluppo);
		this.prodotti = prodotti;
	}

	@Override
	public String generaSeriale() {
		setPrefisso("IMP");
		String seriale = getPrefisso() + incrementaId();
		return seriale;
	}

//	@Override
//	public String toString() {
//		return "Impacchettatrice [prodotti=" + prodotti + "]";
//	}
	
	
}
