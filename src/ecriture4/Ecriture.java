package ecriture4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Ecriture {

	public static void main(String[] args) throws IOException {
		try (
				FileWriter fw = new FileWriter("fic_sortie.txt");
				PrintWriter pw = new PrintWriter(fw);
			){
			
			pw.println("Test avec erreur");
			for(int i=0; i<args.length; i++) {
				pw.printf("%s      %d\n", i, args[i]);//erreur
				//pw.printf("%d      %s\n", i, args[i]);
				System.out.println(args[i]); 
			}
		}
		catch (IllegalFormatConversionException ex) {
			System.err.println("Erreur dans la conversion");
		}
	}
}
