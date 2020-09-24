package letturaFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
	
	public static void main(String[] args) {
		BufferedReader objReader = null;
		try {
			String strCurrentLine;

			objReader = new BufferedReader(new FileReader("/root/Desktop/Ethercat.dat"));

			while ((strCurrentLine = objReader.readLine()) != null) {

				System.out.println(strCurrentLine);
			}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
//Questo codice assicurerà che la gestione della memoria sia eseguita in modo efficiente e che venga chiamato il metodo objReader.close () che rilascia la memoria.

