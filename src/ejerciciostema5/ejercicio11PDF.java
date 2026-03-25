package ejerciciostema5;

import java.util.ArrayList;
import java.util.List;

public class ejercicio11PDF {

	public static void main(String[] args) {
		List<String> nombres = new ArrayList<String>();
		String [] nombresAñadir = {"Lucas","Iker","Nele","Rubio","Ivan","Ruben","Alvaro","Erasmo","Laura","Adrian"};
		
		
		for(int i = 0; i < nombresAñadir.length;i++) {
			nombres.add(nombresAñadir[i]);
		}
		System.out.print(nombres);
		System.out.println();
		eliminarhastaultimo(nombres);
		System.out.println("Ha ganado: " + nombres);

	}
	
	public static void eliminarhastaultimo (List<String> nombres) {
		for (int i = 0; i < 9;i++) {		
			int numeroaletorio = (int) (Math.random()* nombres.size()) ;
			System.out.println( nombres.remove(numeroaletorio) + " eliminad@"); 
		}
	}

}
