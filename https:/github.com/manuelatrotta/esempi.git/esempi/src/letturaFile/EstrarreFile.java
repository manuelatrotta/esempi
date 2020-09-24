package letturaFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
//import java.io.FileFilter;
//import java.io.FilenameFilter;
import java.io.IOException;

public class EstrarreFile {
	
	public static void main (String[]args) {
		
		
		File dir = new File("Ethercat1.dat");
		  String[] children = dir.list();
		  String filename = null;
		  if (children == null) {
			  System.out.println("non vi sono file");
		  } else {
		      for (int i=0; i < children.length; i++) {
		          //  nome dei file presenti nella directory
		           filename = children[i];
		      }
		      System.out.println(filename);
		  }
		  
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
		
		 
		  // é possibile filtrare i file dal nome che iniziano con [

//		  FilenameFilter filter = new FilenameFilter() {
//		      public boolean accept(File dir, String name) {
//		          return name.startsWith("[");
//		      }
//		  };
//		  children = dir.list(filter);
		 
		  // The list of files can also be retrieved as File objects
		 // File[] files = dir.listFiles();
		 
		  // This filter only returns directories
//		  FileFilter fileFilter = new FileFilter() {
//		      public boolean accept(File file) {
//		          return file.isDirectory();
//		      }
//		  };
		  //files = dir.listFiles(fileFilter);
	}

}
