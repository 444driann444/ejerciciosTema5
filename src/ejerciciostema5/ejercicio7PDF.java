package ejerciciostema5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ejercicio7PDF {

	public static void main(String[] args) {
		
		List<Integer>lista1 = generarNumerosRand();
		Collections.sort(lista1);
		System.out.println("La coleccion 1  es: ");
		System.out.println(lista1);
		System.out.println();
		System.out.println("Los numeros que le faltan son: ");
		System.out.println(cromosFaltan(lista1));
		List<Integer>lista2 = generarNumerosRand2();
		Collections.sort(lista2);
		System.out.println();
		System.out.println("La coleccion 2  es: ");
		System.out.println(lista2);
		System.out.println();
		System.out.println("Los cromos que quiero comprar son: ");
		System.out.println(cromosComprar(lista1, lista2));
		System.out.println();
		System.out.println("Lista 1 despues de comprar los cromos que le faltaban: ");
		List<Integer>lista12 = cromosComprar(lista1, lista2);
		lista1.addAll(lista12);
		Collections.sort(lista1);
		System.out.println(lista1);
		System.out.println();
		System.out.println("Lista 2 despues de que lista 1 le haya comprado los que le faltaban: ");
		lista2.removeAll(lista12);
		System.out.println(lista2);
		
		
		
		

	}

	public static List<Integer> generarNumerosRand() {
		
		List<Integer> numeros = new ArrayList<Integer>();
		for (int i = 1; i <= 500; i++) {
			int numerorand = (int) (Math.random()*300) + 1 ;
			 numeros.add(numerorand);
			}
	
		return numeros;
	}
	
	public static List<Integer> generarNumerosRand2() {
		
		List<Integer> numeros = new ArrayList<Integer>();
		for (int i = 1; i <= 250; i++) {
			int numerorand = (int) (Math.random()*300) + 1 ;
			 numeros.add(numerorand);
			}
	
		return numeros;
	}
	
	public static List<Integer> cromosFaltan(List<Integer> cromos){
		
		List<Integer> numerosFaltan = new ArrayList<Integer>();
		
		for (int i = 1; i <= 300; i++) {
			if (!cromos.contains(i) ) {
				numerosFaltan.add(i);
			}
		}
		return numerosFaltan;
	}
	public static List<Integer> cromosComprar(List<Integer> cromos, List<Integer> cromos2){
		
		List<Integer> numerosCompra = new ArrayList<Integer>();
		
		for (int i = 1; i < cromos2.size(); i++) {
			if (!cromos.contains(cromos2.get(i)) ) {
				numerosCompra.add(cromos2.get(i));
			}
		}
		return numerosCompra;
	}
}
