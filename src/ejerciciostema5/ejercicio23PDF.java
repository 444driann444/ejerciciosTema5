package ejerciciostema5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ejercicio23PDF {

	public static void main(String[] args) {
		
		Videoclub videoClub = new Videoclub();
		
		videoClub.anadirPelicula("Jackie Brown");
		videoClub.anadirPelicula("Pulp Fiction");

		
		videoClub.anadirCliente("Sergio");
		videoClub.anadirCliente("María");

		
		
		Cliente cliente = videoClub.buscarCliente(1);
		if(cliente== null) {
			System.out.println("El cliente con id 1 no existe");
		}else {
			System.out.println(cliente);
		}
		
		Calendar fecha = new GregorianCalendar();
		fecha.set(2023, Calendar.MARCH, 2);
		videoClub.anadirPrestamo(1, 100, fecha);
		
		videoClub.imprimirVideoclub();

		
	}

}
