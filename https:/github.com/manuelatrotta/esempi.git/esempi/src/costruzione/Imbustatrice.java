package costruzione;

public class Imbustatrice extends Macchina {
	
	private int prodotti;

	
	public int getProdotti() {
		return prodotti;
	}

	public void setProdotti(int prodotti) {
		this.prodotti = prodotti;
	}

	
	
	public Imbustatrice(String nome, String prefisso, String seriale, String destinazione, int costoMateriale,
			int costoSviluppo) {
		super(nome, prefisso, seriale, destinazione, costoMateriale, costoSviluppo);
		// TODO Auto-generated constructor stub
	}

	public Imbustatrice( String nome, String prefisso, String seriale, String destinazione, int costoMateriale,
			int costoSviluppo, int prodotti) {
		super(nome,prefisso, seriale, destinazione, costoMateriale, costoSviluppo);
		this.prodotti = prodotti;
	}

	@Override
	public String generaSeriale() {
		setPrefisso("IMB");
		String seriale = getPrefisso() + incrementaId();
		return seriale;
	}
	
	@Override
	public int costo() {
		int costo = getCostoMateriale() + getCostoSviluppo();
		return costo;
	}

	@Override
	public String toString() {
		return "Imbustatrice [prodotti=" + prodotti + "]";
	}
	
	@Override
	public String getTipologia() {
		 return tipologia = setTipologia("Imbustatrice");
	}
}
