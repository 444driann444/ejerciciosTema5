package ejerciciostema5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ejercicio6PDF {

	public static void main(String[] args) {
		
		List<String> nombres = new ArrayList<String>();
		
		nombres.add("Marcos");
		nombres.add("Adrian");
		nombres.add("Lucas");
		nombres.add("Juan");
		nombres.add("Ivan");
		nombres.add("Lucia");
		nombres.add("Maria");
		nombres.add("Mateo");
		nombres.add("Mateo");

		System.out.println(nombres);
		System.out.println(siEsta(nombres));
		
		System.out.println("Creacion de 20 numeros random en lista");
		List<Integer> numeros = generarNumerosRand();
	
		System.out.println(numeros);
		
		System.out.println("Ordenados de menor a mayor");
		Collections.sort(numeros);
		System.out.println(numeros);
		System.out.println("Ordenados de mayor a menor");
		Collections.sort(numeros,Collections.reverseOrder());
		System.out.println(numeros);
		
		
	}
	
	public static boolean siEsta (List<String> nombre) {
		
		for (int i = 0; i < nombre.size(); i++) {
			for(int j = i + 1; j < nombre.size(); j++ ) {
				if (nombre.get(i).equals(nombre.get(j))) {
					return true;
				}
			}
		}
		return false;
	}
	public static List<Integer> generarNumerosRand() {
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		for (int i = 0; i < 20; i++) {
			int numerorand = (int) (Math.random()*100) + 1 ;
			 numeros.add(numerorand);
			}
	
		return numeros;
	}

}
