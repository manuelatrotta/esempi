package letturaFile;

import java.io.*;

//JAXP: ecco le librerie che ci consentono di parsare il documento XML,
//di default con Xcerces.
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;


import org.w3c.dom.Document;
import org.w3c.dom.Node;


public class Parse {

	public static void main(String[] args) throws Exception {

		// 
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

// Instanza nuovo Documento
		DocumentBuilder builder = factory.newDocumentBuilder();

// Caricamento documento da un file 
		Document doc = builder.parse(new File("ethercat.xml"));

// primo nodo è la radice
		Node root = doc.getFirstChild();
		{

// ciclo per ogni nodo presente nella lista dei nodi della radice
			for (int i = 0; i < root.getChildNodes().getLength(); i++) {
//  il primo nodo è il nodo modulo gli altri sono  nodi figli
				Node modulo = root.getChildNodes().item(i);

//Se il nodo è un Element_Node  stampo il nome e gli attributi se presenti
				for (int j = 0; j < modulo.getChildNodes().getLength(); j++) {
					Node element = modulo.getChildNodes().item(j);
					if (element.getNodeType() == Node.ELEMENT_NODE) {
						System.out.println(
								"Nome dell'attributo: " + element.getNodeName() + " = " + element.getTextContent());
						if (element.hasAttributes()) {
							for (int k = 0; k < element.getAttributes().getLength(); k++) {
								Node attribute = element.getAttributes().item(k);
								System.out.println("\tNome dell'attributo: " + attribute.getNodeName()
										+ " - Valore del testo = " + attribute.getTextContent());
							}
						}
					}
				}
			}
		}
	}
}
