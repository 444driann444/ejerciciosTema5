package ejerciciostema5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ejercicio17PDF {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Map<String, String> coches = new HashMap<String, String>();
		int opcion = 0;
		do {
			System.out.println("Opciones:");
			System.out.println("0) Salir ");
			System.out.println("1) Comprobar coche existente");
			System.out.println("2) Añadir coche");
			System.out.println("3) Eliminar coche");
			System.out.println("4) Modificar coche");
			System.out.println("5) Mostrar coches ordenados por matricula");
			
			System.out.println("Seleccion una opcion");
			opcion = teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {
			case 0:
				System.out.println("Hasta pronto");
				break;
			case 1:
				System.out.println("Introduzca una matricula");
				String matricula = teclado.nextLine();
				if (coches.containsKey(matricula)) {
					System.out.println("El coche existe en el mapa");
				}else {
					System.out.println("El coche no existe");
				}
				break;
			case 2:
				System.out.println("Introduce la matricula");
				String matricula1 = teclado.nextLine();
				System.out.println("Introduce la marca");
				String marca = teclado.nextLine();
				if (coches.containsKey(matricula1)) {
					System.out.println("El coche ya esta registrado");
				} else {
					if (comprobarMatricula(matricula1)) {
						coches.put(matricula1, marca);
						System.out.println("Coche registrado");
					}else {
						System.out.println("Matricula mal  registrada");
					}
				}
				break;
			case 3:
				System.out.println("Introduzca su matricula");
				String matricula2 = teclado.nextLine();
				if (coches.containsKey(matricula2)) {
					coches.remove(matricula2);
					System.out.println("Coche eliminado");
				}else {
					System.out.println("La matricula introducida no existe");
				}
				break;
			case 4:
				System.out.println("Introduce la matricula");
				String matricula4 = teclado.nextLine();
				System.out.println("Introduce la marca");
				String marca1 = teclado.nextLine();
				if (!coches.containsKey(matricula4)) {
					System.out.println("El coche no esta registrado");
				}else if (coches.get(matricula4).equals(marca1)) {
					System.out.println("Esta marca ya esta registrada");
				}else {
					coches.put(matricula4, marca1);
				}
				
				break;
			case 5:
				Map<String , String> cochesOrdenados = new TreeMap<String, String>(coches);
				System.out.println(cochesOrdenados);
				break;


			default:
				break;
			}

		} while (opcion != 0);

	}
	
	public static boolean comprobarMatricula(String matricula) {
		if (matricula.length() > 7 || matricula.length() < 5) {
			return false;
		}
		
		for(int i = 0; i < 4 ; i++) {
			if (Character.isDigit(matricula.charAt(0 + i))) {
				return true;
			}
		}
		for(int i = 4; i < matricula.length() ; i++) {
			if (Character.isLetter(matricula.charAt(4 + i))) {
				return true;
			}
		}

		
		return true;
	}

}
