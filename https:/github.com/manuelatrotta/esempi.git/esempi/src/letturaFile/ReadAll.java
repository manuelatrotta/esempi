package letturaFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;




public class ReadAll {
	
	public static void main (String [] args) throws FileNotFoundException  {
		
		File cartella = new File("/root/Desktop/Ethercat.dat");
		
		File [] listOfFiles = cartella.listFiles();
		
		for(int i=0; i<listOfFiles.length; i++) {
			File file = listOfFiles[i];
			System.out.println(file);
			if(file.isFile() && file.getName().startsWith("[")) {
				//String content;
				//BufferedReader objReader = new BufferedReader(new FileReader("/root/Desktop/Ethercat.dat"));
			}
		}
		
		
	}

}
