package costruzione;

public class Macchina {
	
	private static int id;
	private String nome;
	private String prefisso;
	private String destinazione;
	protected String tipologia;
	private int costoMateriale;
	private int costoSviluppo;
	private static int totaleMacchine;

	
	
	
	
	
	public String getPrefisso() {
		return prefisso;
	}
	
	public void setPrefisso(String prefisso) {
		this.prefisso = prefisso;
	}
	
	public String getDestinazione() {
		return destinazione;
	}
	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}
	
	public int getCostoMateriale() {
		return costoMateriale;
	}
	public void setCostoMateriale(int costoMateriale) {
		this.costoMateriale = costoMateriale;
	}
	
	public int getCostoSviluppo() {
		return costoSviluppo;
	}
	public void setCostoSviluppo(int costoSviluppo) {
		this.costoSviluppo = costoSviluppo;
	}
	

	public Macchina(String nome, String prefisso, String seriale, String destinazione, int costoMateriale,
			int costoSviluppo) {
		super();
		
		this.nome= nome;
		this.prefisso = prefisso;

		this.destinazione = destinazione;
		this.costoMateriale = costoMateriale;
		this.costoSviluppo = costoSviluppo;
	}
	
	public  String generaSeriale() {
		
		String seriale = prefisso + incrementaId();
		return seriale;
	}
	
	public int costo() {
		int costo = costoMateriale + costoSviluppo;
		return costo;
	}
	
	public String getTipologia() {
		return tipologia;
	}
	public String setTipologia(String tipologia) {
		return this.tipologia = tipologia;
	}
	
	public static int getTotaleMacchine() {
		return totaleMacchine;
	}
	public static int setTotaleMacchine(int totaleMacchine) {
		Macchina.totaleMacchine = totaleMacchine;
		return totaleMacchine;
	}
	

	public String toString() {
		return "Macchina [id=" + getId() + ", prefisso=" + prefisso + ", destinazione=" + destinazione + ", costoMateriale="
				+ costoMateriale + ", costoSviluppo=" + costoSviluppo + "]";
	}

	public static int incrementaProdotti() {
		return totaleMacchine++;
		
	}
	
	public static int incrementaId() {
		return id++;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Macchina.id = id;
	}
	
}
