package ejerciciostema5;

import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ejercicio18PDF {
	private static int id = 1;
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		Map<Integer, Calendar> reservas = new HashMap<Integer, Calendar>();
		
		do {
			System.out.println("0) Salir");
			System.out.println("1) Comprobar reserva");
			System.out.println("2) Añadir reserva");
			System.out.println("3) Eliminar reserva");
			System.out.println("4) Modificar reserva");
			System.out.println("5) Ordenar por fecha");
			System.out.println("6) Ordenar por id");
			System.out.println("7) Imprimir reservas");

			System.out.print("Introduzca la opcion: ");
			opcion = teclado.nextInt();
			
			switch (opcion) {
			case 0:
				System.out.println("Hasta luego");
				break;

			case 1:
				comprobarReserva(reservas, teclado);
				break;
				
			case 2:
				annadirReserva(reservas, teclado);
				break;
				
			case 3:
				eliminarReserva(reservas, teclado);
				break;
				
			case 4:
				modificarReserva(reservas, teclado);
				break;
				
			case 5:
				reservas = ordenarReservasFecha(reservas);
				imprimirReservas(reservas);
				break;
				
			case 6:
				reservas = ordenarReservasId(reservas);
				imprimirReservas(reservas);
				break;
	
			case 7:
				imprimirReservas(reservas);
				break;
			
			}
			
		}while(opcion != 0);
		
		
	}

	private static void imprimirReservas(Map<Integer, Calendar> reservas) {		
		for(Map.Entry<Integer, Calendar> reserva : reservas.entrySet()) {
			System.out.println("id: " + reserva.getKey() + " - fecha: " + reserva.getValue().get(Calendar.DAY_OF_MONTH) + "/" + reserva.getValue().get(Calendar.MONTH) + "/" + reserva.getValue().get(Calendar.YEAR));
		}
		
	}

	private static  Map<Integer, Calendar> ordenarReservasId(Map<Integer, Calendar> reservas) {
		Map<Integer, Calendar> reservasOrdenar = new TreeMap<>(reservas);
		return reservasOrdenar;
	}

	private static  Map<Integer, Calendar> ordenarReservasFecha(Map<Integer, Calendar> reservas) {
		Map<Integer, Calendar> reservasOrdenar = new TreeMap<>(Comparator.comparing(reservas :: get));
		reservasOrdenar.putAll(reservas);
		return reservasOrdenar;
		
	}

	private static void modificarReserva(Map<Integer, Calendar> reservas, Scanner teclado) {
		System.out.println("Introduce un id");
		int id = teclado.nextInt();
		System.out.println("Introduzca el día de la reserva");
		int dia = teclado.nextInt();
		System.out.println("Introduzca el mes de la reserva");
		int mes = teclado.nextInt();
		System.out.println("Introduzca el año de la reserva");
		int anno = teclado.nextInt();
        Calendar fecha = new GregorianCalendar(anno, mes, dia);
      
    	if(reservas.containsKey(id) && dia == reservas.get(id).get(Calendar.DAY_OF_MONTH) && mes == reservas.get(id).get(Calendar.MONTH) && anno == reservas.get(id).get(Calendar.YEAR)) {
			System.out.println("Es la misma fecha que tiene el coche");	
		}else if (!reservas.containsKey(id)){
			System.out.println("El id no existe");
		}else {
	        System.out.println("Quieres modificar la fecha con los datos indicados indicados 1/si 2/no");
	        int respuesta = teclado.nextInt();
	        if(respuesta == 1) {
	        	  reservas.put(id, fecha);
	        	  System.out.println("Reserva ya modificada");
	        }else if (respuesta == 2) {
	        	System.out.println("No se ha modificado ninguna fecha");
	        }
		}
	}

	private static void eliminarReserva(Map<Integer, Calendar> reservas, Scanner teclado) {
		System.out.println("Indica el id de la reserva a eliminar");
		int id = teclado.nextInt();
		
		if(reservas.containsKey(id)) {
		 reservas.remove(id);
		 System.out.println("La reserva con ese id ha sido eliminada");
		}else {
			System.out.println("No se ha podido eliminar ninguna reserva porque no existe ninguna reserva con ese id");
		}
		
	}

	private static void annadirReserva(Map<Integer, Calendar> reservas, Scanner teclado) {
		System.out.println("Introduzca el día de la reserva");
		int dia = teclado.nextInt();
		System.out.println("Introduzca el mes de la reserva");
		int mes = teclado.nextInt();
		System.out.println("Introduzca el año de la reserva");
		int anno = teclado.nextInt();
        Calendar fecha = new GregorianCalendar(anno, mes, dia);
		reservas.put(id++, fecha);
	}

	private static void comprobarReserva(Map<Integer, Calendar> reservas, Scanner teclado) {
		
		System.out.println("Introduzca el id de la reserva a comprobar:");
		int id = teclado.nextInt();
		
		if(reservas.containsKey(id)) {
			
			System.out.println("Reserva existente!");

		}else {
			System.out.println("la reserva no existe");
		}
		
		
	}

}