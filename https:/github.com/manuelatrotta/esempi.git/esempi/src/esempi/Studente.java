package esempi;

public class Studente {
	
	private String nome;
	private String classe;
	private int voto;
	
	
	
	public Studente(String nome, String classe, int voto) {
		this.nome = nome;
		this.classe = classe;
		this.voto = voto;
	}
	
	
	public Studente() {
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		this.voto = voto;
	}



	
	

}
