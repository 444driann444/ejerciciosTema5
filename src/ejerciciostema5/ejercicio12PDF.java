package ejerciciostema5;

import java.util.ArrayDeque;
import java.util.Deque;

public class ejercicio12PDF {

	public static void main(String[] args) {
		
			Deque<Integer> cola = new ArrayDeque<Integer>();
			cola.add(1);
			cola.add(2);
			cola.add(3);
			cola.add(2);
			cola.add(4);
			cola.add(5);
			cola.add(2);
			
		System.out.println("Cola original: " + cola);
		System.out.println("Cola invertida: " + invertirCola(cola));
		System.out.println("Cola eliminando ocurrencias: " + eliminarOcurrencias(cola, 2));
		System.out.println("Cola eliminando repetidos: " + eliminarRepetidos(cola));
		

	}
	public static Deque<Integer> invertirCola(Deque<Integer>cola){
		Deque<Integer> copia = new ArrayDeque<Integer>(cola);
		Deque<Integer> colaInvertida = new ArrayDeque<Integer>();
		while (!copia.isEmpty()) {
			colaInvertida.addFirst(copia.poll());
		}
		return colaInvertida;
		
	}
	
	public static Deque<Integer> eliminarOcurrencias (Deque<Integer> cola, Integer numero){
		Deque<Integer> copia = new ArrayDeque<Integer>(cola);
		Deque<Integer> colanueva = new ArrayDeque<Integer>();
		while (!copia.isEmpty()) {
			int elemento = copia.poll();
			if ( elemento != numero) {
				colanueva.add(elemento);
			}
		}
		return colanueva;
	} 
	
	public static Deque<Integer> eliminarRepetidos (Deque<Integer> cola){
		Deque<Integer> copia = new ArrayDeque<Integer>(cola);
		Deque<Integer> colanueva = new ArrayDeque<Integer>();
		
		while (!copia.isEmpty()) {
		 int elemento = copia.poll();
		 if (!copia.contains(elemento)) {
			 colanueva.add(elemento);
		 }
		}
		return colanueva;
	}

}
