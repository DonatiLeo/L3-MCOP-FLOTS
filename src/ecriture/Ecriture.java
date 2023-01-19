package ecriture;

import java.io.FileWriter; 
import java.io.PrintWriter;

public class Ecriture {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("fic_sortie.txt");
			PrintWriter pw = new PrintWriter(fw); 
			for(int i=0; i<args.length; i++) {
				pw.println(i+" "+args[i]);
				System.out.println(args[i]); 
			}
			pw.close();
		} 
		catch(Exception ex) { 
			System.err.println("Erreur sur le fichier"); 
		}
	}
}
