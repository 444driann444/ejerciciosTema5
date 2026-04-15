package ejerciciostema5 ;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Videoclub {

	private int codigoPelicula = 1;
	private int codigoCliente = 100;
	private List<Cliente> clientes;
	private Map<Integer, String> peliculas;
	private List<Prestamo> prestamos;

	public Videoclub() {
		clientes = new ArrayList<Cliente>();
		peliculas = new HashMap<Integer, String>();
		prestamos = new ArrayList<Prestamo>();
	}
	
	public Cliente buscarCliente(int numeroCarnet) {
		for(Cliente cliente : clientes) {
			if(cliente.getNumeroCarnet() == numeroCarnet) {
				return cliente;
			}
		}
		return null;
	}
	
	public String buscarPelicula(int codigo) {
		String nombre = peliculas.get(codigo);
		return nombre;
	}

	public void anadirPelicula(String pelicula) {
		peliculas.put(codigoPelicula, pelicula);
		codigoPelicula++;
	}
	
	public void anadirCliente(String nombre) {
		Cliente cliente = new Cliente(codigoCliente, nombre);
		clientes.add(cliente);
		codigoCliente++;
	}
	

	
	//Comprobar si pelicula prestada
	//Comprobar si cliente con prestamo

	
	public boolean anadirPrestamo(int codigoPelicula, int codigoCliente, Calendar fecha) {
		//HACER LO ÚLTIMO
		//1 BUSCAR LA PELÍCULA
		String nombrePelicula = buscarPelicula(codigoPelicula);
		if(nombrePelicula == null) {
			System.out.println("La pelicula no existe");
			return false;
		}
		//2 BUSCAR EL CLIENTE
		Cliente cliente = buscarCliente(codigoCliente);
		if(cliente == null) {
			System.out.println("El cliente no existe.");
			return false;
		}
		//3 COMPROBAR SI LA PELÍCULA ESTÁ PRESTADA
		
		if(peliculaPrestada(codigoPelicula)) {
			System.out.println("La película está prestada.");
			return false;
		}
		//4 COMPROBAR SI EL CLIENTE TIENE ALGÚN PRÉSTAMO ACTIVO
		if(clienteConPrestamoActivo(codigoCliente)) {
			System.out.println("El cliente tiene algún préstamo activo.");
			return false;
		}
		Prestamo prestamo = new Prestamo(cliente, codigoPelicula, fecha);
		prestamos.add(prestamo);
		return true;
	}
	
	public boolean peliculaPrestada ( int codigoPelicula) {
		for(Prestamo prestamo : prestamos) {
			if(prestamo.getCodigoPelicula() == codigoPelicula && prestamo.getFechaDevolucion() == null) {
				return true;
			}
		}
		return false;
	}
	
	public boolean clienteConPrestamoActivo(int codigoCliente) {
		for(Prestamo prestamo : prestamos) {
			if(prestamo.getCliente().getNumeroCarnet() == codigoCliente && prestamo.getFechaDevolucion() == null) {
				return true;
			}
		}
		return false;
	}
	

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}


	public List<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
	
	//TODO: IMPRIMIR PRÉSTAMOS MOROSOS
	//TODO: DEVOLVER PRÉSTAMO


	public void imprimirVideoclub() {
		System.out.println("Videoclub:");
		System.out.println("\tClientes:");
		
		for (Cliente cliente : clientes) {
			System.out.println("\t\t" + cliente);
		}
		
		System.out.println("\tPelículas:");

		for (Map.Entry<Integer, String> entrada : peliculas.entrySet()) {
			System.out.println("\t\t" + entrada.getKey() + " : " + entrada.getValue());
		}
		
		System.out.println("\tPréstamos:");

		for(Prestamo prestamo : prestamos) {
			System.out.print("\t\t Cliente: " + prestamo.getCliente().getNumeroCarnet() + " , Película: " + prestamo.getCodigoPelicula() + " , Fecha de prestamo: " + " , Fecha de devolucion: ");
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	        String fechaFormateada = sdf.format(prestamo.getFechaPrestamo().getTime());
	        System.out.println(fechaFormateada);
			//TODO: IMPRIMIR TAMBIÉN FECHA DE DEVOLUCIÓN
	        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	        String fechaFormateada2 = sdf1.format(prestamo.getFechaDevolucion().getTime());
	        System.out.println(fechaFormateada2);
		}

	}

	@Override
	public String toString() {
		return "VideoClub [clientes=" + clientes + ", peliculas=" + peliculas + ", prestamos=" + prestamos + "]";
	}

}

