package costruzione;

public class Marchesini {
	
	
	
	private Macchina[] merce = new Macchina[10];
	private int numArticoli = 0;
	
	public Macchina[] getMerce() {
		return this.merce;
	}
	
	public int getNumArticoli() {
		return this.numArticoli;
	}
	
	public boolean caricaArticolo(Macchina art) {
		
		if(this.getNumArticoli() < merce.length) {
			for(int i = 0; i<merce.length; i++) {
				if(merce[i] == null) {
					merce[i] = art;
					this.numArticoli++;
					art.incrementaProdotti();
					return true;
				}
			}
			return false;
		} else {
			System.out.println("Officina piena");
			return false;
		}
	}
	
	
	public void stampaArticoli() {
		if(this.getNumArticoli() == 0) {
			System.out.println("Officina vuota!");
			return;
		}
		System.out.println("Macchine in officina: ");
		for(Macchina art : merce) {
			if(art != null) System.out.println("Macchina: "+ art);
		}
	}

	
	public void mediaCosti() {
		int sum = 0;
		int media = 0;
		
		for(int i=0; i< merce.length; i++) {
			if(merce[i] != null) {
				sum += merce[i].costo();
				
			media = sum / merce[i].getTotaleMacchine();
			}
		}
		System.out.println("costo medio:" + media);
	}
	
	
	public void mediaCostOTipologia() {
		int sum = 0;
		int media = 0;
		int conteggioImbustatrice = 0;
		int conteggioImpacchettatrice = 0;
		int conteggioRobot = 0;
		for (int i = 0; i < merce.length; i++) {
			if (merce[i] != null) {
				//if (merce[i].getTipologia().equals("Imbustatrice")) {
				if(merce[i] instanceof Impacchettatrice) {
					sum += merce[i].costo();
					conteggioImbustatrice++;

					media = sum / conteggioImbustatrice;
				} else if (merce[i] instanceof Robot) {
					sum += merce[i].costo();
					conteggioRobot++;
					media = sum / conteggioRobot;
				}else {
					sum += merce[i].costo();
					conteggioImpacchettatrice++;
					media = sum / conteggioImpacchettatrice;
				}
			}
		}
		System.out.println("imb medio:" + media);
		System.out.println("rob medio:" + media);
		System.out.println("imp media:" + media);
	}

	
	
//	public void numeroMacchine() {
//		int totaleMacchine = 0;
//		for(Macchina art:merce) {
//			if(art != null) {
//			totaleMacchine ++;
//			//System.out.println("numero prodotti:" + totaleMacchine); //output 1 2 ... 10
//			}
//		}
//		System.out.println("numero prodotti:" + totaleMacchine); //output 10 
//	}
	
	public void maggiorCosto() {
		
		int maggiore = merce[0].costo();
		for(int i=0; i< merce.length; i++) {
			if(merce[i] != null) {
				if(merce[i].costo() > maggiore ) {
					maggiore = merce[i].costo();
				}
			}
		}
		System.out.println("la macchina più cara è:" + maggiore);
	}
	
	
	public void guadagno() {
		int guadagno = 0;
		int totaleMacchineVendute = 0;
		for(Macchina art:merce) {
			if(art == null) {
				totaleMacchineVendute = 0;
			}else if(art != null) {
				guadagno += art.costo();
				totaleMacchineVendute ++;
			}
		}
		System.out.println("guadagno" + guadagno);
		System.out.println("macchine vendute" + totaleMacchineVendute);
	}
}
