package costruzione;

import java.util.ArrayList;

public class TestCostruzione {
	
	public static void main (String[] args) {
		
		Imbustatrice modelloBase = new Imbustatrice("modelloBase", "ip", "Mantova", "kk", 0, 0);
		
		modelloBase.setDestinazione("Bologna");
		modelloBase.setCostoMateriale(1000);
		modelloBase.setCostoSviluppo(3000);
		modelloBase.generaSeriale();

		modelloBase.costo();
		
		System.out.println(modelloBase);
		System.out.println(modelloBase.costo());
		System.out.println("seriale:" + modelloBase.generaSeriale());
		System.out.println("tipologia macchina creata" + " " + modelloBase.getTipologia());

		
		Macchina imp = new Impacchettatrice("imp", "op", "roma","Impacchettatrice", 1000, 3000, 2);
		
		imp.costo();
		imp.generaSeriale();
		System.out.println(imp);
		System.out.println(imp.costo());
		System.out.println(imp.generaSeriale());
		
		Robot rob = new Robot("rob", "li", "roma","impacchettatrice", 7000, 10000, 2);
		
		rob.setNumeroBraccio(1);
		rob.generaSeriale();

		rob.costo();
		
		System.out.println(rob);
		System.out.println(rob.costo());
		System.out.println(rob.generaSeriale());
		System.out.println("totale macchine prodotte"+ " " +Macchina.getTotaleMacchine());
		
		
		Marchesini mag = new Marchesini();
		
	
		
		mag.stampaArticoli();
		
//		
//		for(int i = 0; i<(mag.getMerce().length/2); i++) {
//				mag.caricaArticolo(modelloBase);
//			mag.caricaArticolo(imp);
//			mag.caricaArticolo(rob);
//		}	
		
		
		
		mag.caricaArticolo(imp);
		mag.caricaArticolo(rob);
		
		
		
		
		mag.stampaArticoli();
		
		mag.mediaCosti();
		
		mag.maggiorCosto();
		
		mag.guadagno();
		
		mag.mediaCostOTipologia();
		
		
		
		
		//-----------------
		ArrayList<Object> macchine = new ArrayList<>();
		
		Robot robo = new Robot("robo", "li", "roma", "Robot", 9000, 10000, 1);
		
	    macchine.add(modelloBase);
	    macchine.add(rob);
	    macchine.add(robo);
	    macchine.remove(modelloBase);
	    
	    System.out.println(macchine);
	    
	}

}
