package lecture;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lecture {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (
	    		FileReader fr = new FileReader("res/fic.txt");
	    		BufferedReader br = new BufferedReader(fr) 
	    	){
	    		String ligne = null;
	    		do {
	    			ligne = br.readLine();
	    			if (ligne == null) break; 
	    			System.out.println(ligne); // affiche la ligne
	    		 } while(true);
	    	}
	   	}
}
