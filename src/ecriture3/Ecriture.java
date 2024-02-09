package ecriture3;

import java.io.FileWriter; 
import java.io.PrintWriter;

public class Ecriture {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("fic_sortie.txt");
			PrintWriter pw = new PrintWriter(fw); 
			pw.println("Test avec erreur");
			for(int i=0; i<args.length; i++) {
				//pw.printf("%s      %d\n", i, args[i]);//erreur
				pw.printf("%d      %s\n", i, args[i]);//ok
				System.out.println(args[i]); 
			}
			pw.close();
		} 
		catch(Exception ex) { 
			System.err.println("Erreur sur le fichier"); 
		}
	}
}
