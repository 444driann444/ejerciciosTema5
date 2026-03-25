package ejerciciostema5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ejercicio14PDF {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>();
		System.out.println("Lista de numeros: " + añadirLista(numeros));
		Set<Integer> numerosSet = new HashSet<Integer>(numeros);
		System.out.println("Lista de numeros Set: " + numerosSet);
		
		System.out.println("El set contiene los 25 numeros: " + setContienetodoslosnumeros(numerosSet));
		
	}
	public static List<Integer> añadirLista (List<Integer> numeros){
		for (int i = 0 ; i < 100 ; i++) {
			int numerorand = (int) (Math.random()*25)+1;
			numeros.add(numerorand);
		}
		return numeros;
	}
	public static  boolean  setContienetodoslosnumeros(Set<Integer> numeros) {
		for (int i = 0; i < 25; i++) {
			if(!numeros.contains(i)) {
				return false;
			}
		}
		return true;
	}
}
