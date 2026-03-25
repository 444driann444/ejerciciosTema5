package ejerciciostema5;

import java.util.Set;
import java.util.TreeSet;

public class ejercicio15PDF {

	public static void main(String[] args) {
		Set<Integer> Conjunto1 = new TreeSet<Integer>();
		Set<Integer> Conjunto2 = new TreeSet<Integer>();
		Set<Integer> Conjunto3 = new TreeSet<Integer>();
		
		System.out.println("Conjunto A: " + generarNumero(Conjunto1, 15));
		System.out.println("Conjunto B: " +generarNumero(Conjunto2, 10));
		System.out.println("Conjunto C: " +generarNumero(Conjunto3, 5));
		
		System.out.println();
		System.out.println("Union A + B: " + unirDosConjuntos(Conjunto1, Conjunto2));
		System.out.println("Union A + C: " + unirDosConjuntos(Conjunto1, Conjunto3));
		System.out.println("Union B + C: " + unirDosConjuntos(Conjunto2, Conjunto3));
		System.out.println("Union A + B + C: " + unirDosConjuntos( unirDosConjuntos(Conjunto1, Conjunto2) , Conjunto3));
		
		System.out.println();
		System.out.println("Interseccion A + B: " + interserccion(Conjunto1, Conjunto2));
		System.out.println("Interseccion A + C: " + interserccion(Conjunto1, Conjunto3));
		System.out.println("Interseccion B + C: " + interserccion(Conjunto2, Conjunto3));
		System.out.println("Interseccion A + B + C: " + interserccion(interserccion(Conjunto1, Conjunto2), Conjunto3));
		
		System.out.println();
		System.out.println("Es conjunto A subconjunto de B: " + esSubconjunto(Conjunto1, Conjunto2));
		System.out.println("Es conjunto A subconjunto de C: " + esSubconjunto(Conjunto1, Conjunto3));
		System.out.println("Es conjunto B subconjunto de C: " + esSubconjunto(Conjunto2, Conjunto3));
		

	}
	public static Set<Integer> generarNumero (Set <Integer> conjunto, int tamanio){
		for (int i = 0 ; i < tamanio; i++) {
			int random =(int) (Math.random()*20) + 1;
			conjunto.add(random);
		}
		return conjunto;
	}
	
	public static Set<Integer> unirDosConjuntos (Set <Integer> conj1, Set<Integer> conj2){
		Set<Integer> conjuntoNuevo = new TreeSet<Integer>();
		conjuntoNuevo.addAll(conj1);
		conjuntoNuevo.addAll(conj2);
		return conjuntoNuevo;
	}
	
	public static Set<Integer> interserccion (Set<Integer> conj1, Set<Integer> conj2){
		Set<Integer> conjuntoNuevo = new TreeSet<Integer>();
		
		for(Integer elemento : conj1) {
			if(conj2.contains(elemento)) {
				conjuntoNuevo.add(elemento);
			}
		}
		return conjuntoNuevo;
	}
	
	public static boolean esSubconjunto (Set<Integer> conj1, Set<Integer> conj2) {
		if (!conj1.containsAll(conj2)) {
			return false;
		}else {
			return true;
		}
		
	}

}
